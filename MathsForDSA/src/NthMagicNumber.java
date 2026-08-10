import java.util.*;
public class NthMagicNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int ans = 0;
        int count = 1;
        while(n > 0) {
            ans += (int) ((n & 1) * Math.pow(5, count));
            count ++;
            n = n >> 1;
        }
        System.out.println(ans);
    }
}
