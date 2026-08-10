package JavaByKK.Recursion;

public class ReverseNumber {

    static int sum = 0;
    static void rev(int num) {
        if(num == 0) {
            return;
        }
        int rem = num % 10;
        sum = sum * 10 + rem;
        rev(num / 10);
    }

    static int rev2(int num) {
        return helper(num, (int)Math.log10(num));
    }
    static int helper(int num, int b) {
        if(b == 0) {
            return num;
        }
        return (num % 10) * (int)Math.pow(10, b) + helper(num / 10, b - 1);
    }

    public static void main(String[] args) {
        System.out.println(rev2(897));
    }

}
