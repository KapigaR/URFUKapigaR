package Lr7.Example2;

public class subClass extends superClass{

    int numeric;

    subClass(subClass ob){
        super(ob);
        numeric = ob.numeric;
    }

    subClass(){

    }

    subClass(String userStr){
        super(userStr);
    }

    subClass(int n){
        numeric = n;
    }

    subClass(String userStr, int n){
        super(userStr);
        numeric = n;
    }
}
