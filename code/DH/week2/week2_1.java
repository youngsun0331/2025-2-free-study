package week2;
import java.io.*;
import java.util.StringTokenizer;

public class week2_1 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //개수 입력받음
        String str=br.readLine();
        int cnt = Integer.parseInt(str);

        //입력받음
        String input_str = br.readLine();
        String[] arr= input_str.split("");

        //합을 출력
        int result=0;
        for (int i=0; i<cnt;i++){
            int new_cal = Integer.parseInt(arr[i]);
            result += new_cal;
        }
        System.out.println(result);
        br.close();
        bw.close();
    }
}