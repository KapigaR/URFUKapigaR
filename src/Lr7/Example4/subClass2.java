package Lr7.Example4;

public class subClass2 extends subClass1{

    int num1;

    subClass2(char ch1, String str1, int num1) {
        super(ch1, str1);
        this.num1 = num1;
    }

    subClass2(subClass2 ob){
        super(ob);
        ob.num1 = num1;
    }
}
