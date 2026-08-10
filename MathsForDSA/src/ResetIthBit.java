public class ResetIthBit {
    public static void main(String[] args) {
        int num = 44; // 101100
        int bit = 3;
        System.out.println( Integer.toBinaryString(44 & ~(1 << bit - 1)));
    }
}
