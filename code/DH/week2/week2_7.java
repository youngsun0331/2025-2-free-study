package week2;
import java.io.*;
import java.util.StringTokenizer;

public class week2_7 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //문자열을 입력받음
        String str = br.readLine();

        //split을 통해 문자열을 잘라 리스트에 담음.
        String[] arr = str.split("");
        
        //result 초기화
        String result="";

        //출력
        int size = arr.length;
        int d = size / 10;
        int m = size % 10;

        for (int i=0;i<d;i++){
            for (int j=0;j<10;j++){
                result+=arr[i*10+j];
            }
            bw.write(result + "\n");
            result="";
        }

        for (int k=d*10; k<d*10+m; k++){
            result+=arr[k];
        }
        bw.write(result + "\n");

        bw.flush();

        br.close();
        bw.close();
    }
}