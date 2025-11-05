package week1;

import java.io.*;
import java.util.StringTokenizer;

public class apb3 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter( new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());




        for(int i=0;i<n;i++){

            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str," ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            bw.write(a+b+"");
            bw.newLine();
        }

        bw.flush();


    }
}
