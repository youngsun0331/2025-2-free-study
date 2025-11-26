package week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Bubble {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        mData[] A = new mData[N];

        for (int i = 0; i < N; i++) {
            A[i] = new mData(Integer.parseInt(reader.readLine()), i);
        }
        Arrays.sort(A);
        int Max = 0;
        for (int i = 0; i < N; i++) { // 격차가큰값 넣어버림  이전위치에서 지금위치를 뺀다는거
            if (Max < A[i].index - i) {
                Max = A[i].index - i; // 이렇게 구하는이유 원레는 전체원소들이
                // 이동해봤자 1칸임 그걸이용해서 for문이 몇번 반복했을까를 추리 -> 가장 많이 이동한녀석이 즉 for문 작동횟수가 된느거지
            }
            System.out.println(Max + 1); // 배열의 index 기준으로 해서 표시
        }

    }
}

