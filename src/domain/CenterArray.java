package domain;

import java.util.ArrayList;
import java.util.List;

public class CenterArray {
    public static void Calculate(int num){
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < num; i++){
            numbers.add(i, 0);
        }

        int center = num / 2;
        for (int i = center, j = 0; 0 <= i; i--, j++){
            numbers.set(i, j);
        }
        for (int i = center + 1, j = 1; i < numbers.size(); i++, j++){
            numbers.set(i, j);
        }
        System.out.println("\u001B[36m" + numbers);
    }
}
