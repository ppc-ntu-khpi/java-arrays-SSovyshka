package domain;

import java.util.ArrayList;
import java.util.List;


public class FillArray {
    public static void Calculate(int minNum, int maxNum, int N){

        int min = minNum;
        int max = maxNum;
        int range = max - min + 1;

        List<Integer> numbers = new ArrayList<>();

        for(int i = 0; i < N; i++){
            numbers.add(i, (int)(Math.random() * range) + min);
        }

        for (int i = 0; i < numbers.size(); i++){
            System.out.print("\u001B[36m" + numbers.get(i) + " | ");
        }

    }

}
