package quiz;

public class ReverseString {
    public String reverse(String input) {
        ///return new StringBuffer(input).reverse().toString();
        char [] cha= new char[input.length()];
        for(int i=0;i<input.length();i++){
            cha[i]=input.charAt(input.length()-1-i);
        }
        return new String(cha);
    }
}