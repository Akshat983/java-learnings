package JavaByKK;
import java.util.Scanner;

public class leetcodeHouseRobber {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] ar=new int[n];
        int s1=0,s2=0;
        for (int i = 0; i < n; i++) {
            ar[i]=in.nextInt();
            if(i%2==0)
                s1+=ar[i];
            else
                s2+=ar[i];
        }
        System.out.println(Math.max(s1,s2));

    }
}
