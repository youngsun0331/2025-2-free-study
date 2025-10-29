import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter( new OutputStreamWriter(System.out));

        String str = br.readLine();

        StringTokenizer st = new StringTokenizer(str," ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        bw.write(a+b+"");
        bw.flush();
    }
}