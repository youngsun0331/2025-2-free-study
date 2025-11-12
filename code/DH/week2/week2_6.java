package week2;
import java.io.*;
import java.util.StringTokenizer;

public class week2_6 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //몇월 몇일인지를 받음
        String string = br.readLine();
        StringTokenizer str = new StringTokenizer(string," ");

        int mon = Integer.parseInt(str.nextToken());
        int day = Integer.parseInt(str.nextToken());

        int sum=0;

        //출력
        for (int i=1;i<mon;i++){
            if (i==1 || i==3 || i==5 || i==7 ||i==8||i==10||i==12){
                sum+=31;
            }
            //2월인 경우.
            else if(i==2){
                sum+=28;
            }
            else if(i==4||i==6||i==9||i==11) {
                sum += 30;
            }
        }

        int fin = (sum+day)%7;

        if (fin==1){
            bw.write("MON");
        }
        if (fin==2){
            bw.write("TUE");
        }
        if (fin==3){
            bw.write("WED");
        }
        if (fin==4){
            bw.write("THU");
        }
        if (fin==5){
            bw.write("FRI");
        }
        if (fin==6){
            bw.write("SAT");
        }
        if (fin==0){
            bw.write("SUN");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}