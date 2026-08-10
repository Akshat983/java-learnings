public class PowerOfTwo {
    public static void main(String[] args) {
        int n = 66;
        /*
        power of two (In Binary) : only one bit will be 1 rest all will be 0
        so,
            ex : 16 = 10000
            ex : 8 = 1000

        therefore,
            16 = 15+1 or 1111 + 1
            and :    01111
                   & 10000
                   --------
                     00000

            hence, we can conclude that
            n & (n-1) == 0 for a number to be power of two
         */
        System.out.println((n & (n-1)) == 0);
    }
}
