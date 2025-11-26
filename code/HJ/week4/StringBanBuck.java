package week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class StringBanBuck {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        //여기서 i가 받은 개숫 만큼 돌리는거임
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T  ; i++) {

            StringTokenizer str = new StringTokenizer(br.readLine(), " ");
            int count = Integer.parseInt(str.nextToken());
            String  s = str.nextToken();


        //i를 쓰게되면 해당 배열의 크기를 맞게 넣어야하는데 그걸 초과하거나 적게 넣을수있음
            for (int j = 0; j < s.length(); j++) {

                for (int k = 0; k < count ; k++) {
                    sb.append(s.charAt(j));

                }
            }
            sb.append("\n");
        }

        System.out.println(sb);

    }
}
