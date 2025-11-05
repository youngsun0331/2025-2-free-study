package week2;

import java.io.*;

public class numbersum11720 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));



        String str = br.readLine();
        String[] st = str.split("");
        int n=1;
        for( String string : st) {
            bw.write(string);

            if(n%10 == 0){
                bw.newLine();
            }
            n++;
        }
        bw.flush();

    }
}
