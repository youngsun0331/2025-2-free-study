package week3;

import java.io.*;

public class DNApw {
    static int checkArr[];
    static int myArr[];
    static int checkSeret;


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //숫자 입력 받고 ex)9 8
        String[] list = br.readLine().split(" ");

        int s = Integer.parseInt(list[0]); // 전체배열 길이
        int p = Integer.parseInt(list[1]); // 부분집합 배열 길이
        int result = 0;

        checkArr = new int[] {0,0,0,0}; //현재 얼마나 들어와있는가?
        myArr = new int[4];
        checkSeret = 0;

        //문자열 받기
        String[] A = br.readLine().split("");

        //조건
        String[] c = br.readLine().split(" ");

        //조건 받기
        for(int i=0;i<4;i++)
        {
            checkArr[i] = Integer.parseInt(c[i]); // 조건 받기
            if(checkArr[i] == 0) { //해당 문자는 조건이 없다고 해서 조건하나 충족됐다고 +1 해주는거임
                checkSeret++; } // 이걸올리는이유는 기준을 4이면 충족이된다고 한상태이기떄문에 미리 올려놓는것
        }

        //초깃값 세팅
        for(int i=0;i<p;i++){ //window 처음으로 모두 입력
            Add(A[i]);}

        if(checkSeret == 4){ // 처음부터 경우의수가 성립하는경우 즉 모든 초깃값이 0000이라는뜻임
            result++;} //현재 case가 모두 맞는거임

        for(int i =p;i<s;i++) // window 이동시작
        {
            int j= i-p; // 가장앞에있는애 표시
            Add(A[i]); // 가장듸에있는애의 애 추가
            Remove(A[j]); //  가장뒤에있는애 제거
            if(checkSeret == 4){ // 제거하면서
                result++;}
        }

        //슬라이딩 윈도우 처리부분
        bw.write(result+"");
        bw.flush();

    }
    //새로 들어온 문자를 처리하는 함수, 문자하나씩 받는거임
    private static void Add(String c){
        switch (c)
        {
            case "A":
                myArr[0]++; // 현재 A 가 들어왔다고 충족 문자 올림
                if(myArr[0] == checkArr[0]){ // 조건이랑 일치하는 경우  조건 성립이라고 ++해주는거임
                    checkSeret++; }
                break;
            case "C":
                myArr[1]++;
                if(myArr[1] == checkArr[1]){
                    checkSeret++; }
                break;
            case "G":
                myArr[2]++;
                if(myArr[2] == checkArr[2]){
                    checkSeret++; }
                break;
            case "T":
                myArr[3]++;
                if(myArr[3] == checkArr[3]){
                    checkSeret++; }
                break;
        }
    }

    private static void Remove(String c) {
        switch (c) {
            case "A":
                if (myArr[0] == checkArr[0]) { // 내리기 전에 충족이 되있던애이면 내리라는 뜻
                    checkSeret--;   }
                myArr[0]--; // 근데 충족조건에 현재나의 배열에 A가 없다는것임
                break;
            case "C":
                if (myArr[1] == checkArr[1]) {
                    checkSeret--;   }
                myArr[1]--;
                break;
            case "G":
                if (myArr[2] == checkArr[2]) {
                    checkSeret--;  }
                myArr[2]--;
                break;
            case "T":
                if (myArr[3] == checkArr[3]) {
                    checkSeret--;  }
                myArr[3]--;
                break;
        }
    }
}
