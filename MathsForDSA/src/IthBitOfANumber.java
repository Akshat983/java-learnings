public class IthBitOfANumber {
    public static void main(String[] args) {
        int num = 47;   // 101111
        int bit = 4;
        System.out.println((47 & (1 << (bit-1))) == 0? 0 : 1);
    }
}
