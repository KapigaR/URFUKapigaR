package Lr6.Example8;

public class Main {
    public static void main(String[] args) {

        int[] numArray = {1, 2, 3, 4, 5, 6, 7, 8};

        System.out.println(average(numArray));
    }

    static double average (int[] num){

        int average = 0;
        for (int i : num) average += i;
        return (double) average/ num.length;
    }
}
