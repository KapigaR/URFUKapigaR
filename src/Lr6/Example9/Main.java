package Lr6.Example9;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] intArray = {1,2,3,4,5,6,7,8,9,0};
        System.out.println(Arrays.toString(Revers(intArray)));
    }

    static int[] Revers (int[] userNum){
        int[] reversArray = new int[userNum.length];
        for (int i : userNum) reversArray[userNum.length-1 - i] = userNum[i];
        return reversArray;
    }
}
