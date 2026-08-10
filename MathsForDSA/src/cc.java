import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        int p;
        Scanner in = new Scanner(System.in);
        p = in.nextInt();
        int c=0;
        while(p-->0) {
            int n = in.nextInt();
            n--;
            int[] ar = new int[n];
            for (int i = 0; i < n; i++) {
                ar[i] = in.nextInt();
            }
            for (int i = 0; i < n; i++) {
                if(ar[i] != i || ar[i] != n-i) {
                    c = 1;
                    break;
                }
            }
        }
        if(c == 1) {
            System.out.println("0");
        }
        else {
            System.out.println("2");
        }
    }
}
