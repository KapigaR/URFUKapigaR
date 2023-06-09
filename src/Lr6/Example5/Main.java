package Lr6.Example5;

public class Main {
    public static void main(String[] args) {

        System.out.println(sumSquare(9));
        System.out.println(sumSquareRecursion(9));
    }
    static long sumSquare(int num){
        long sum = 0;
        for (int i = 1; i<=num;i++){
            sum += (long) i * i;
        }
        return sum;
    }

    static long sumSquareRecursion(int i){
        long result = 0;
        if (i == 1) return 1;
        return (long) (Math.pow(i, 2) + sumSquareRecursion(i-1));
    }
}
