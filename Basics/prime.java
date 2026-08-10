package JavaByKK;
import java.util.*;
public class prime {
    static boolean isPrime(int n)
    {
        if(n<2)
            return false;
        int c=2;
        while(c*c<=n)
        {
            if(n%c==0)
                return false;
            c++;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n1 =in.nextInt();
        int n2 =in.nextInt();
        if(n2<n1)
        {
            int t=n1;
            n1=n2;
            n2=t;
        }
        for(int i=n1;i<=n2;i++)
        {
            if(isPrime(i))
                System.out.print(i+" ");
        }
    }
}
