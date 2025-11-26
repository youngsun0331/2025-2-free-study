package week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ElectronicRange {
    public static void main(String[] args) throws IOException {
        Integer[] sec = {300, 60, 10};
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Integer[] count = {0, 0, 0};
        Integer  totalSec = Integer.parseInt(br.readLine());


        for (int i = 0; i < sec.length; i++) {
            while (totalSec >= sec[i]) {
                totalSec = totalSec - sec[i];
                count[i]++;
            }
            sb.append(count[i] + " ");
        }

        if (totalSec != 0) {
            System.out.println(-1);
        }else {
            System.out.println(sb);
        }
    }
}
