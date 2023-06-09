package Lr6.Example1;

public class Example1 {
    public static void main(String[] args) {

        TextClass textClass1 = new TextClass();

        textClass1.TextClass('0');
        textClass1.TextClass("Привет!");

        System.out.println(textClass1.stringField);
        System.out.println(textClass1.charField);

        char[] chars1 = new char [5];
        chars1[0] = 'H';
        chars1[1] = 'E';
        chars1[2] = 'L';
        chars1[3] = 'L';
        chars1[4] = 'O';

        textClass1.TextClass(chars1);
        System.out.println(textClass1.stringField);

        char[] chars2 = new char [1];
        chars2[0] = 'Z';

        textClass1.TextClass(chars2);
        System.out.println(textClass1.charField);
    }
}
