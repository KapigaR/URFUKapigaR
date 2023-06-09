package Lr7.Example4;

public class subClass1 extends superClass{

    String str1;

    subClass1(char ch1, String str1) {
        super(ch1);
        this.str1 = str1;
    }

    subClass1(subClass1 ob){
        super(ob);
        ob.str1 = str1;
    }
}
