package Lr6.Example7;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        char[] userSymbol = {'A', 'a', 'B', 'b', 'C', 'c', 'D', 'd'};

        System.out.println(Arrays.toString(codeCrypt(userSymbol)));
    }

    static int[] codeCrypt (char[] userSymbol){

        int[] intCrypt = new int[userSymbol.length];

        for (int i = 0; i< userSymbol.length;i++) {
            intCrypt[i] = userSymbol[i];
        }

        return intCrypt;
    }
}
