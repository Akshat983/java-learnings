public class XORFromZeroTillN {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(xor(n));
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
