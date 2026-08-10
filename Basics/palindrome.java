package JavaByKK;
import java.util.*;
public class palindrome {
    static boolean isPalin(int n)
    {
        int nn=0,num=n;
        while(num!=0)
        {
            int d=num%10;
            nn=nn*10+d;
            num/=10;
        }
        if(n==nn)
            return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        System.out.println(isPalin(n));
    }
}
