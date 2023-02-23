package domain;

import java.util.ArrayList;
import java.util.List;

public class MathArray {
    public static void Calculate(int minNum, int maxNum, int N) {

        int min = minNum;
        int max = maxNum;
        int range = max - min + 1;

        int[] numbers = new int[N];

        for(int i = 0; i < N; i++){
            numbers[i] = (int)(Math.random() * range) + min;
        }

        long result = 0;

        for(int i = 0; i < N; i++){
            short sing = (short) (Math.random() * (4 - 0 + 1));
            if(sing == 1 || sing == 0) {
                System.out.println((i + 1) + ". " + result + " + " + numbers[i]);
                result += numbers[i];
            }else if(sing == 2){
                System.out.println((i + 1) + ". " + result + " - " + numbers[i]);
                result -= numbers[i];
            }else if(sing == 3){
                System.out.println((i + 1) + ". " + result + " * " + numbers[i]);
                result *= numbers[i];
            }else if(sing == 4){
                System.out.println((i + 1) + ". " + result + " : " + numbers[i]);
                result /= numbers[i];
            }
        }
        System.out.println(" ");
        System.out.println("Результ обчислення: " + result);
    }
}
