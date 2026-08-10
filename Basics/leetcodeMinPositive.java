package JavaByKK;
import java.util.*;
public class leetcodeMinPositive {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n= in.nextInt();
        int[] ar=new int[n];
        for (int i = 0; i < n; i++) {
            ar[i]=in.nextInt();
        }
        System.out.println(min(ar));
    }
    static int min(int[] ar)
    {
        int n=ar.length;
        for (int i = 1; true; i++) {
            int c=0;
            for (int j = 0; j < n; j++) {
                if(i!=ar[j])
                    c++;
            }
            if(c==n) {
                return i;
            }
        }
    }
}
