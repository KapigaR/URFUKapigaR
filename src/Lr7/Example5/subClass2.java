package Lr7.Example5;

public class subClass2 extends superClass{
    char chr1;

    subClass2(String str1, char chr1) {
        super(str1);
        this.chr1 = chr1;
    }
    subClass2(subClass2 ob) {
        super(ob.toString());
        ob.chr1 = chr1;
    }


    void monitor(){
        String monitorValue = "sub" + "\n" +
                " Class name: " + this.getClass().getSimpleName() + "\n" +
                "str1: " + str1 + "\n" +
                "chr1: " + this.chr1 ;
        System.out.println(monitorValue);
    }
}
