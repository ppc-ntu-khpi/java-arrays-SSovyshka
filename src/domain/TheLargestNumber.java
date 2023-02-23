package domain;

import java.util.ArrayList;
import java.util.List;

public class TheLargestNumber {
    public static void Calculate(int minNum, int maxNum, int num){
        int min = minNum;
        int max = maxNum;
        int range = max - min + 1;

        List<Integer> numbers = new ArrayList<>();

        for(int i = 0; i < num; i++){
            numbers.add(i, (int)(Math.random() * range) + min);
        }
        System.out.println(numbers);
        int number = 0;
        int counter = 0;
        int tempCounter = 0;
        for(int i = 0; i < numbers.size(); i++){
            for (int j = 0; j < numbers.size(); j++){
                if(numbers.get(i) == numbers.get(j)){
                    tempCounter++;
                }
                if(tempCounter > counter){
                    counter = tempCounter;
                    number = numbers.get(i);
                }
            }
            tempCounter = 0;
        }

        System.out.println("\u001B[36m" + "Число которое повторяется = " + number);
        System.out.println("\u001B[36m" + "Число повторений = " + counter);
    }
}
