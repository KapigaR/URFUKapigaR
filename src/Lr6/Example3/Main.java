package Lr6.Example3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] searchArray = {5,5,7,6,9,68,2,71,100,105,4};

        System.out.println(getMax(searchArray));
        System.out.println(getMin(searchArray));
        System.out.println(getAverage(searchArray));

    }

    public static int getMin (int ... arrayInt){
        Arrays.sort(arrayInt);
        return arrayInt[0];
    }

    public static int getMax (int ... arrayInt){
        Arrays.sort(arrayInt);
        return arrayInt[arrayInt.length-1];
    }

    public static int getAverage (int ... arrayInt){
        int sum = Arrays.stream(arrayInt).sum();
        return sum/arrayInt.length;
    }

}
