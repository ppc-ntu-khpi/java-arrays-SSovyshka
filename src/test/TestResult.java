package test;

import domain.*;

import java.util.Scanner;

public class TestResult {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\u001B[31m" + "Введіть номер завдання" +  "\u001B[0m");
        System.out.println("1. Заповніть масив простими числами з вказаного діапазону і виведіть його у вигляді рядка \n" +
                "2. Заповнити масив довільного розміру числами в порядку зростання, починаючи з центру масиву, наприклад, [5,4,3,2,1,0,1,2,3,4,5] \n" +
                "3. Знайти в масиві число, яке повторюється найбільшу кількість разів\n" +
                "4. Рядок містить математичний вираз типу \"1 + 33-4 * 7\". Написати програму для підрахунку значення виразу (пріоритет операцій можна не враховувати)\n" +
                "5. Знайти всі різні подання числа N у вигляді сум K натуральних чисел (1 <K <N). Якщо К = 0, то видати всі можливі суми. Подання чисел, що відрізняються лише порядком доданків, вважаються однаковими (Не завершенная) \n" +
                "7. Трамвайні квитки мають шестизначні номери, вважають якщо квиток «щасливий» то сума перших трьох цифр дорівнює сумі останніх. Знайти кількість щасливих квитків");
        int key = scanner.nextInt();

        if(key == 1){
            System.out.println("Введіть мінімальне число");
            int min = scanner.nextInt();
            System.out.println("Введіть максимальне число");
            int max = scanner.nextInt();
            System.out.println("Введіть кількість комірок");
            int num = scanner.nextInt();
            FillArray.Calculate(min, max, num);
        } else if (key == 2) {
            System.out.println("Введіть кількість комірок (найкраще не парне)");
            int num = scanner.nextInt();
            CenterArray.Calculate(num);
        } else if (key == 3) {
            System.out.println("Введіть мінімальне число");
            int min = scanner.nextInt();
            System.out.println("Введіть максимальне число");
            int max = scanner.nextInt();
            System.out.println("Введіть кількість комірок");
            int num = scanner.nextInt();
            TheLargestNumber.Calculate(min, max, num);
        } else if (key == 4) {
            System.out.println("Введіть мінімальне число");
            int min = scanner.nextInt();
            System.out.println("Введіть максимальне число");
            int max = scanner.nextInt();
            System.out.println("Введіть кількість комірок");
            int num = scanner.nextInt();
            MathArray.Calculate(min, max, num);
        } else if (key == 5) {
            SumN.Calculate(20, 2);
        } else if(key == 7){ // Основная задача с задания
            System.out.println("Введіть кількість квитків");
            int num = scanner.nextInt();
            Tickets.Calculate (num);
        }


    }
}
