package week3;

import java.io.*;
import java.util.StringTokenizer;

public class GuganHap_Hard {
    static long[] arr;
    static long[] tree;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // N: 수의 개수, M: 수의 변경 횟수, K: 구간 합 구하는 횟수
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        arr = new long[N + 1];
        for (int i = 1; i <= N; i++) {
            arr[i] = Long.parseLong(br.readLine());
        }

        // 세그먼트 트리 사이즈 구하기 (N * 4면 충분)
        // 정확히는 2^(ceil(log2(N)) + 1)
        tree = new long[N * 4];

        // 1. 트리 초기화 (최초 구간 합 구성)
        init(1, 1, N);

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < M + K; i++) {
            st = new StringTokenizer(br.readLine());
            int command = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());
            long b = Long.parseLong(st.nextToken());

            if (command == 1) {
                // 1 a b: a번째 수를 b로 바꾸기
                // 기존 값과의 차이(diff)를 구해서 트리에 반영
                long diff = b - arr[a];
                arr[a] = b; // 배열 값 갱신
                update(1, 1, N, a, diff);
            } else {
                // 2 a b: a번째부터 b번째까지의 합 구하기 (b는 int 범위지만 입력 편의상 long으로 받음)
                sb.append(sum(1, 1, N, a, (int) b)).append("\n");
            }
        }
        System.out.print(sb);
    }

    // 세그먼트 트리 초기화
    // node: 현재 트리 노드 번호, start~end: 현재 노드가 담당하는 배열 구간
    public static long init(int node, int start, int end) {
        if (start == end) {
            return tree[node] = arr[start];
        }
        int mid = (start + end) / 2;
        return tree[node] = init(node * 2, start, mid) + init(node * 2 + 1, mid + 1, end);
    }

    // 구간 합 구하기
    // left~right: 구하고자 하는 구간
    public static long sum(int node, int start, int end, int left, int right) {
        // 범위 밖에 있는 경우
        if (left > end || right < start) {
            return 0;
        }
        // 범위 안에 완전히 포함되는 경우
        if (left <= start && end <= right) {
            return tree[node];
        }
        // 걸쳐 있는 경우 (자식 노드로 분할)
        int mid = (start + end) / 2;
        return sum(node * 2, start, mid, left, right) + sum(node * 2 + 1, mid + 1, end, left, right);
    }

    // 수 변경하기 (Update)
    // index: 변경된 수의 인덱스, diff: 변화량
    public static void update(int node, int start, int end, int index, long diff) {
        // 범위 밖에 있는 경우
        if (index < start || index > end) {
            return;
        }

        // 범위 안에 있으면 현재 노드 값 갱신
        tree[node] += diff;

        // 리프 노드가 아니면 자식들도 갱신
        if (start != end) {
            int mid = (start + end) / 2;
            update(node * 2, start, mid, index, diff);
            update(node * 2 + 1, mid + 1, end, index, diff);
        }
    }
}