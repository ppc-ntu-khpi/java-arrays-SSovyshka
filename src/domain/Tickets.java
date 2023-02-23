package domain;

import java.util.ArrayList;
import java.util.List;

public class Tickets {
    public static void Calculate(int N){
        int counter = 0;

        int min = 100000;
        int max = 600000;
        int range = max - min + 1;
        List<Integer> tickets = new ArrayList<>();

        for (int i = 0; i < N; i++){
            tickets.add(i, (int)(Math.random() * range) + min);
        }
        System.out.println("Номера квитків = " + tickets);
        for(int i = 0; i < N; i++){
            String tempStr = String.valueOf(tickets.get(i));
            char[] chars = new char[6];
            tempStr.getChars(0, 6, chars, 0);

            int firstSum = 0;
            int secondSum = 0;
            for (int j = 0; j < 6; j++){
                int temp = Character.digit(chars[j], 10);
                if (j < 3){
                    firstSum += temp;
                }else{
                    secondSum += temp;
                }
            }
            if (firstSum == secondSum){
                counter++;
            }
        }

        System.out.println("\u001B[36m" + "Кількість щасливих білетів = " + counter);
    }
}
