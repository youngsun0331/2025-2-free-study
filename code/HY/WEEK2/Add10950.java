import java.io.*;
import java.util.StringTokenizer;

public class Add10950 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String string = br.readLine();
        StringTokenizer str = new StringTokenizer(string," ");
        int a = Integer.parseInt(str.nextToken());
        int b = Integer.parseInt(str.nextToken());
        int c = a + b - 3;

        bw.write(c+"");
        bw.flush();

    }
}
