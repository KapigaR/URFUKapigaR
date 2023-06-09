package Lr7.Example2;

public class superClass {

    private String str1;

    superClass(superClass ob){
        str1 = ob.str1;
    }

    superClass(){

    }
    superClass(String userString){
        str1 = userString;
        System.out.println("Длинна строки: " + str1.length());
    }
}
