package JavaByKK;
import java.util.*;
public class pythagorian {
    static boolean isPyth(int a,int b,int c)
    {
        a=a*a;
        b=b*b;
        c=c*c;
            return (a+b==c||b+c==a||a+c==b);
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println(isPyth(in.nextInt(),in.nextInt(),in.nextInt()));
    }
}
