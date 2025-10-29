import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        br.close();
        int total=0;
        for(int i=0;i<n;i++){
            int num = Integer.parseInt(String.valueOf(str.charAt(i)));
            total += num;


        }
        bw.write(total+"");
        bw.close();



    }
}