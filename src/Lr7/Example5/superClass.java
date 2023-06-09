package Lr7.Example5;

public class superClass {

    protected String str1;

    superClass(String str1){
    this.str1 = str1;
    }
   superClass(superClass ob) {
       ob.str1 = str1;
   }

    void monitor(){
        String monitorValue = "super" + "\n" +
                " Class name: " + this.getClass().getSimpleName() + "\n" +
                "str1: " + this.str1;
        System.out.println(monitorValue);
    }
}
