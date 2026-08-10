package JavaByKK.Recursion;

public class PalindromeUsingReverse {
    public static void main(String[] args) {
        int num = 0;
        System.out.println(isPalin(num));
    }

    static boolean isPalin(int n) {
        if(n==0){
            return true;
        }
        return (n == rev(n));
    }

    static int rev(int n) {
        int d = (int)Math.log10(n);
        if(d == 0) {
            return n;
        }
        return (n%10) * (int)Math.pow(10, d) + rev(n/10);
    }
}
