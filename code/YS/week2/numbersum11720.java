package week2;

import java.io.*;

public class numbersum11720 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int cnt =0;
        String number = br.readLine();
        String[] l = number.split("");
        for(int i=0;i<n;i++){
            int num = Integer.parseInt(l[i]);
            cnt += num;

        }


        bw.write(cnt);
        bw.flush();


    }
}
