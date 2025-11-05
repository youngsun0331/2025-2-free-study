package week1;

import java.io.*;
import java.util.StringTokenizer;

public class week1_7 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a= Integer.parseInt(br.readLine());

        for (int i=1;i<=a;i++){
            String string = br.readLine();
            StringTokenizer str = new StringTokenizer(string," ");

            int first = Integer.parseInt(str.nextToken());
            int second= Integer.parseInt(str.nextToken());

            int result = first+second;
            bw.write("Case #"+i+": "+first+" + "+second+" = "+result+"\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}