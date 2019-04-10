package solutions.string;

/**
 * Created by jaywangs on 2019/4/9
 */
public class T125_ValidPalindrome {
    /**
     * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
     *
     * Note: For the purpose of this problem, we define empty string as valid palindrome.
     *
     * Example 1:
     *
     * Input: "A man, a plan, a canal: Panama"
     * Output: true
     * Example 2:
     *
     * Input: "race a car"
     * Output: false
     **/

    public static boolean isPalindrome(String s) {
        char [] chars = s.toCharArray();
        int i= 0, j = chars.length - 1;
        while (i <= j) {
            if (!Character.isLetterOrDigit(chars[i]))
                i++;
            else if (!Character.isLetterOrDigit(chars[j]))
                j--;
            else {
                if(Character.toLowerCase(chars[i]) != Character.toLowerCase(chars[j])){
                    return false;
                }
                else{
                    i++;
                    j--;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(" race a car"));
    }
}
