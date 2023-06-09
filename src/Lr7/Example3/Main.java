package Lr7.Example3;

public class Main {
    public static void main(String[] args) {

        superClass sClass = new superClass(0);
        String className = sClass.toString();
        System.out.println(className);

        subClass1 class1 = new subClass1(0, "");
        String className1 = class1.toString();
        System.out.println(className1);

        subClass2 class2 = new subClass2(0, "", "");
        String className2 = class2.toString();
        System.out.println(className2);
    }
}
