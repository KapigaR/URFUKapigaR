package Lr9.Example2;

import java.util.OptionalDouble;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Example1 {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Введите несколько целых чисел: ");

            try {
            String[] userNums = sc.nextLine().split(" ");
            int[] userNumParse = new int[userNums.length];
            int lengthNumAr = 0;
            for (int i = 0; i < userNums.length; i++) {
                userNumParse[i] = Integer.parseInt(userNums[i]);
                if (userNumParse[i]<=0){
                    userNumParse[i] = 0;
                } else {
                    lengthNumAr++;
                }
            }
            if (lengthNumAr == 0){
                throw new RuntimeException();
            }
            int[] resultArr = new int[lengthNumAr];
            int i = 0;
            for (int j = 0; j < userNumParse.length; j++) {
               if (userNumParse[j] != 0) {
                   resultArr[i] = userNumParse[j];
                   i++;
               }
            }


            OptionalDouble averageNum = IntStream.of(userNumParse).average();
            System.out.println("Сумма целых положительных чисел = " + averageNum);
        } catch (NumberFormatException e) {
                System.out.println("Введены некорректные данные");
            System.out.println("Введите целые числа через пробел");
        } catch (RuntimeException e){
                System.out.println("Нет ни одного положительного числа");
            }
    }
}
