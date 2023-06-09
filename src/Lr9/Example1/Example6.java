package Lr9.Example1;

public class Example6 {
    public static void main(String[] args) {
        try {

            System.out.println("0");
            throw new NullPointerException("Error");
        } catch (ArithmeticException e){
            System.out.println("1");
        } catch (Exception e){
            System.out.println("2");
        } //catch (RuntimeException e){
            //System.out.println("3");
        //}
        System.out.println("4");
    }
}
