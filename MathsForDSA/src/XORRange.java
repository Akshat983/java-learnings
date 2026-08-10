public class XORRange {
    public static void main(String[] args) {
        int a = 3;
        int b = 7;
        System.out.println(xor(b) ^ xor(a-1));
    }

    private static int xor(int n) {
        if(n % 4 == 3)
            return 0;

        if(n % 4 == 0)
            return n;

        if(n % 4 == 1)
            return 1;

        return n+1;
    }
}
