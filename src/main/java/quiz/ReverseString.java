package quiz;

public class ReverseString {
    public String reverse(String input) {
        //return new StringBuffer(input).reverse().toString();
        char[] forwards = input.toCharArray();
        //char[] backwards = input.toCharArray();
        String backwards = "";
        
        for(int i = forwards.length-1; i >= 0; i--) {
        	backwards += forwards[i];
        }

        return backwards;
    }
}