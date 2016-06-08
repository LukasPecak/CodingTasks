/**
 * Created by LPecak on 2016-06-08.
 */
public class PalindromeProcessor {

    public static PalindromeProcessor newPalindromeProcessor(){
        return new PalindromeProcessor();
    }

    private PalindromeProcessor() {
    }

    public boolean isPalindrome(String text) {
        if(text == null){
            return false;
        }
        String reverse = new StringBuilder(text.toLowerCase()).reverse().toString();
        if(reverse.equals(text.toLowerCase())){
            return true;
        }
        return false;
    }
}
