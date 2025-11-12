package week2;
import java.io.*;
import java.util.StringTokenizer;

public class week2_2 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //끝 정수를 입력받음
        String str = br.readLine();
        int fin = Integer.parseInt(str);

        //합을 출력
        int result=0;
        for (int i=1; i<=fin; i++){
            result += i;
        }
        bw.write(result+"");
        bw.flush();

        br.close();
        bw.close();
    }
}