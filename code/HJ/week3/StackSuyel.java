package week3;




import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class StackSuyel {
    public static void main(String[] args) throws IOException {

        // 교재에는 scanner로 써있지만  아래것을 쓰는게 더 빠르기에 습관 자체를 이걸로 드리는게 맞다고함
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // N개수 몇개 받을 지 정하기
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(br.readLine()); //  N의 숫자 받아내기
        }
        Stack<Integer> stack = new Stack<>();
        // stringbuffer 또한 위와  마찬가지임
        StringBuilder sb = new StringBuilder();
        int num= 1;
        boolean result = true;


        for (int i = 0; i < A.length; i++) { //
            int su = A[i];
            if (su >= num) {
                while (su >= num) { // 1조건
                    stack.push(num++);
                    sb.append("+\n");
                }
                stack.pop();
                sb.append("-\n");
            }
            else
            {
                int n = stack.pop(); // 2조건
                if (n > su) { //스택안에 있는 애보다 작을시 오
                    System.out.println("NO");
                    result = false;
                    break;
                }
                else {
                    sb.append("-\n");
                }
            }
        }
    if (result) System.out.println(sb);
    }
}
