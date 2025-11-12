package week2;
import java.io.*;
import java.util.StringTokenizer;

public class week2_3 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //정수의 개수를 받음
        String str = br.readLine();
        int cnt = Integer.parseInt(str);

        //배열 생성
        String num = br.readLine();
        String[] arr = num.split(" ");;

        //최대,최소 출력
        int max=0, min=0;
        for (int i=0;i<cnt;i++){
            int com=Integer.parseInt(arr[i]);
            if (i==0){
                max=com;
                min=com;
            }
            max= Math.max(max,com);
            min= Math.min(min,com);
        }

        bw.write(min+" "+max+"");
        bw.flush();

        br.close();
        bw.close();
    }
}