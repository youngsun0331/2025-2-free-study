import java.io.*;


public class numPlus11720 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter( new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split("");
        br.close();
        int sum =0;
        for(int i=0;i<n;i++){
            sum += Integer.parseInt(str[i]);
        }

        System.out.println(sum);
        bw.write(sum+" ");
        bw.flush();


    }
}