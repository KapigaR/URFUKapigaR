package Lr7.Example3;

public class subClass1 extends superClass{
    String userStr;

    subClass1(int userNum, String userStr) {
        super(userNum);
        this.userStr = userStr;
    }

    String getValue(int num, String str1){
        this.userStr = str1;
        return userStr;
    }


    @Override
    public String toString() {
        String ClassNameAndFieldValue;
        ClassNameAndFieldValue = "sub" + "\n" +
                " Class name: " + this.getClass().getSimpleName() + "\n" +
                " num 1 = " + getValue(10) + "\n" +
                " str 1 = " + getValue(10,"Hello");;
        return ClassNameAndFieldValue;
    }
}
