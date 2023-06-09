package Lr7.Example5;

public class subClass1 extends superClass{
    private int num1;

    subClass1(String str1, int num1) {
        super(str1) ;
        this.num1 = num1;
    }
    subClass1(subClass1 ob) {
        super(ob);
        ob.num1 = num1;
    }

    void monitor(){
        String monitorValue = "sub" + "\n" +
                " Class name: " + this.getClass().getSimpleName() + "\n" +
                "str1: " + str1 + "\n" +
                "num1: " + this.num1 ;
        System.out.println(monitorValue);
    }
}
