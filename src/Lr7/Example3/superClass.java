package Lr7.Example3;

public class superClass {
    int num1;

    superClass(int userNum){
        this.num1 = userNum;
    }

    String getValue(int num){

        String numString = String.valueOf(num);
        return numString;
    }
    @Override
    public String toString() {

        String superClassNameAndFieldValue;
        superClassNameAndFieldValue = "super" + "\n" +
                " Class name: " + this.getClass().getSimpleName() + "\n" +
                " num 1 = " + getValue(10);
        return superClassNameAndFieldValue ;
    }

}
