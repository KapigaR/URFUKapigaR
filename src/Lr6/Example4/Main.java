package Lr6.Example4;

public class Main {
    public static void main(String[] args) {

        System.out.println(doubleFactorial(6));

        int inputUser = 6;

        int num = inputUser % 2 == 0 ? 2 : 1;
        System.out.println(inputUser * doubleFactorialRecursion(inputUser, num));
    }
    static long doubleFactorial (int num){

        if (num<=65) {
            long doubleFactorial = num;
            for (int i = num - 2; i >= 1; ) {


                doubleFactorial = doubleFactorial * i;
                i = i - 2;
            }

            return doubleFactorial;
        }
        else {
            System.out.print("Error, number too large(>65): ");
            return num;
        }
    }
    static long doubleFactorialRecursion (int inputUser, int num){
            if (inputUser <= num) {
                return 1;
            }
            inputUser-=2;
            return inputUser * doubleFactorialRecursion(inputUser, num);
        }
}
