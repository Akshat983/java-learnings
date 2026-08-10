package JavaByKK.Recursion;

public class Palindrome {
    public static void main(String[] args) {
        int n = 1038301;
        System.out.println(isPalin(n));
    }
    static boolean isPalin(int n) {
        if(n == 0) {
            return true;
        }
        return helper(n, (int)Math.log10(n), 0);
    }
    static boolean helper(int n, int first, int last) {
        if(digit(n, first) != digit(n, last))
        {
            return false;
        }
        if(first <= last) {
            return true;
        }
        return helper(n, first-1, last+1);
    }
    static int digit(int n, int pos) {
        n = n/(int)Math.pow(10, pos);
        return n%10;
    }
}
