package Lr7.Example3;

public class subClass2 extends subClass1{
    String userStr2;

    subClass2(int userNum, String userStr, String userStr2) {
        super(userNum, userStr);
        this.userStr2 = userStr2;
    }

    String getValue(int num, String str1, String str2){
        this.userStr2 = str2;
        return userStr2;
    }

    @Override
    public String toString() {
        String ClassNameAndFieldValue;
        ClassNameAndFieldValue = "sub" + "\n" +
                " Class name: " + this.getClass().getSimpleName() + "\n" +
                " num 1 = " + getValue(10) + "\n" +
                " str 1 = " + getValue(10, "Hello") + "\n" +
                " str 2 = " + getValue(10, "Hello", "Hello World");
        return ClassNameAndFieldValue;
    }
}
