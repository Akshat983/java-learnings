package JavaByKK;
import java.util.*;
public class leetcodeGoodArray {
    static int gcd(int a,int b)
    {
        if(b==0)
            return a;
        return gcd(b,a%b);
    }
    static boolean goodArray(int[] ar)
    {
        int gcd=ar[0];
        for(int n : ar)
            gcd= gcd(gcd,n);
        return (gcd==1);
    }
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int n=in.nextInt();
        int[] ar=new int[n];
        for (int i = 0; i < n; i++) {
            ar[i]=in.nextInt();
        }
        System.out.println(goodArray(ar));

    }
}
