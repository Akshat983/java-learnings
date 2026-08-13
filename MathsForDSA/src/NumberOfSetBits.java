package JavaByKK.MathsForDSA.src;

public class NumberOfSetBits {
    public static void main(String[] args) {
        int num = 7765;
        int count = 0;
        System.out.println(Integer.toBinaryString(num));
        while(num > 0) {
            count ++;
            num = num - (num & -num);
        }
        System.out.println(count);
    }
}
