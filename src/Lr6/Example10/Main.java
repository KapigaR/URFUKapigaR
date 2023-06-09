package Lr6.Example10;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arrayInt = getMinMaxValue(10,20,15687,5618,5);
        System.out.println(Arrays.toString(arrayInt));
    }
    public static int[] getMinMaxValue (int ... v){
        Arrays.sort(v);

        int[] arrayInt = new int[2];
        arrayInt[0] = v[0];
        arrayInt[1] = v[v.length-1];
        return arrayInt;
    }
}
