package week2;
import java.io.*;
import java.util.StringTokenizer;

public class week2_5 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //몇단인지를 받음
        String str = br.readLine();
        int num = Integer.parseInt(str);

        //출력
        for (int i=1;i<=9;i++){
            bw.write(num+" * "+i+" = "+num*i+"\n");
        }
        bw.flush();

        br.close();
        bw.close();
    }
}