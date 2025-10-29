import java.io.*;
import java.util.HashMap;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter( new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split("");
        int total=0;
        for (int i =0;i<n;i++){
            total += Integer.parseInt(str[i]);
        }
        bw.write(total+"");
        bw.flush();
    }
}