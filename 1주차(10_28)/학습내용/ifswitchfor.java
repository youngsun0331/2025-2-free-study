

public class ifswitchfor {

    public static void main(String[] args) {
        int score = 85;

        if (score >= 90) {    //score = 85이므로 score >= 90 조건은 false
            System.out.println("점수가 90보다 큽니다.");
            System.out.println("등급은 A 입니다.");
        }
        if (score < 90) {     //score = 85이므로 score < 90 조건은 true
            System.out.println("점수가 90보다 작습니다.");
            System.out.println("등급은 B 입니다.");
        }
    }

}
