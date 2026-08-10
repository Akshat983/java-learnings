package JavaByKK.Strings;
import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next().toLowerCase();
        System.out.println(isPalindrome(str));
    }

    static boolean isPalindrome(String str) {
        int l = str.length();
        int start = 0, end = l - 1;
        while(start < end)
        {
            if(str.charAt(start) != str.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }
}
