package Lr6.Example6;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arrayInt = new int[5];
        arrayInt[0] = 1;
        arrayInt[1] = 2;
        arrayInt[2] = 3;
        arrayInt[3] = 4;
        arrayInt[4] = 5;

        int[] arrayIntResult1 = Main.converseArray(arrayInt, 1);
        System.out.println(Arrays.toString(arrayIntResult1));

        int[] arrayIntResult2 = Main.converseArray(arrayInt, 10);
        System.out.println(Arrays.toString(arrayIntResult2));
    }
    public static int[] converseArray(int[] arrayInt, int value){
        if (value >= arrayInt.length){
            return arrayInt;
        }
        int[] arrayIntResult = new int[value];
        for (int i = 0; i < value; i++){
            arrayIntResult[i] = arrayInt[i];
        }
        return arrayIntResult;
    }
}
