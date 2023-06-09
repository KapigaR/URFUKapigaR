package Lr7.Example4;

public class superClass {

    char ch1;

    superClass(char ch1){
        this.ch1 = ch1;
    }

    superClass(superClass ob){
        ob.ch1 = ch1;
    }
}
