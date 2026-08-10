package JavaByKK.Recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        int num = 4342;
        System.out.println(sumOfDig(num));
    }
    static int sumOfDig(int n) {
        if(n == 0)
            return 0;
        return n % 10 + sumOfDig(n / 10);
    }
}
