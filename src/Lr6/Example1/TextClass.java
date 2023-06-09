package Lr6.Example1;

public class TextClass {

   String stringField;
   char charField;
    public void TextClass(String stringField) {
        this.stringField = stringField;
    }

    public void TextClass(char charField) {
        this.charField = charField;
    }

    public void TextClass(char [] chars){
        if (chars.length == 1){
            this.charField = chars[0];
        } else if (chars.length > 1) {
            this.stringField = String.valueOf(chars);
        }
    }
}
