package week2;
import java.io.*;
import java.util.StringTokenizer;

public class week2_4 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //정수의 개수를 받음
        String str = br.readLine();
        int cnt = Integer.parseInt(str);

        //출력
        for (int i=1;i<=cnt;i++){
            bw.write(i+"\n");
        }
        bw.flush();

        br.close();
        bw.close();
    }
}