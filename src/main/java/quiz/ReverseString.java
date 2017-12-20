package quiz;

public class ReverseString {
    public String reverse(String input) {
        ///return new StringBuffer(input).reverse().toString();
    	// initialize a char array of the same length;
        char [] cha= new char[input.length()];
        // enter chars from string in reverse order into char array
        for(int i=0;i<input.length();i++){
            cha[i]=input.charAt(input.length()-1-i);
        }
        //return new string instance with char array as input
        return new String(cha);
    }
}