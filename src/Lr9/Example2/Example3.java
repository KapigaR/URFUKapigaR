package Lr9.Example2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите через пробел байты");
        try {
            byte[] byteArray = new byte[]{sc.nextByte()};
            byte valueArray = 0;
            for (byte b : byteArray) {
                valueArray += b;
            }
            System.out.println(valueArray);
        } catch (InputMismatchException e){
            System.out.println("Введите корректные числа");
        }
    }
}
