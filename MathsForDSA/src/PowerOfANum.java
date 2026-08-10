public class PowerOfANum {
    public static void main(String[] args) {
        int num = 3;
        int pow = 4;
        int ans = 1;
        /*
        2^3 =(3 in binary = 11) 2^11 = 2^(2^0) * 2^(2^1)
        Similarly,
        2^4 = 2^100 = 2^(2^2)
         */
        while(pow > 0) {
            if((pow & 1) == 1) {
                ans *= num;
            }
            num *= num;
            pow = pow >> 1;
        }
        System.out.println(ans);
    }
}
