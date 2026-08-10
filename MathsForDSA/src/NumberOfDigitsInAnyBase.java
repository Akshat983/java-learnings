public class NumberOfDigitsInAnyBase {
    public static void main(String[] args) {
        int num = 7785;
        int base = 10;
        System.out.println((int) (Math.log(num) / Math.log(base)) + 1);
    }
}
