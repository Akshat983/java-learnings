public class SIEVE {
    public static void main(String[] args) {
        sieve(40);
    }
    static void sieve(int n) {
        boolean[] ar = new boolean[n+1];
        for (int i = 2; i*i < n+1; i++) {
            helper(ar, i);
        }
        for (int i = 2; i < n+1; i++) {
            if(!ar[i])
                System.out.println(i);
        }
    }
    static void helper(boolean[] ar, int n) {
        for (int i = n*2; i < ar.length; i+=n) {
            ar[i] = true;
        }
    }
}