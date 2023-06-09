package Lr9.Example2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("Исходная Матрица: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%4d\t", matrix[i][j]);
            }
            System.out.println();
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите номер столбца: ");
        try {

            int userNum = sc.nextInt();

            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < 1; j++) {
                    System.out.printf("%4d\t", matrix[i][userNum - 1]);
                }
                System.out.println();
            }
        } catch (NumberFormatException e) {
            System.out.println("Введите целое число");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Вы вышли за пределы матрицы");
        } catch (InputMismatchException e){
            System.out.println("Введите целое число");
        }
    }
}