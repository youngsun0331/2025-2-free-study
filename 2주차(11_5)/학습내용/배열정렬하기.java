import java.util.Arrays;
import java.util.Collections;

public class Main{

    public static void main(String[] args) {
        int[] intArr = {8,7,6,5,4};
        for(int i: intArr) 
            System.out.print(i + " ");
        System.out.println();
				//8 7 6 5 4

        Arrays.sort(intArr);
        for (int i : intArr) 
            System.out.print(i + " ");
        System.out.println();
				//4 5 6 7 8

        // String
        String[] strArr = {"d", "c", "b", "a"};
        for(String s: strArr) 
            System.out.print(s + " ");
        System.out.println();
        // d c b a
        Arrays.sort(strArr);
        for (String s : strArr) 
            System.out.print(s + " ");
        System.out.println();
				// a b c d

        Arrays.sort(strArr, Collections.reverseOrder());
        for (String s : strArr) 
            System.out.print(s + " ");
				// d c b a
    }
}