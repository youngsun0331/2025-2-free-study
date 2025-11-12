package week2;

import java.io.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.StringTokenizer;


public class minMax10818 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter( new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str," ");
        Integer[] list = new Integer[n];
        for(int i =0;i<n;i++){
            list[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(list, Collections.reverseOrder());

        bw.write(list[0]+" "+list[n-1]);
        bw.flush();

    }
}
