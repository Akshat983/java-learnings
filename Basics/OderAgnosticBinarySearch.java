package JavaByKK;
import java.util.*;
public class OderAgnosticBinarySearch {
    public static void main(String[] args) {
            Scanner in = new Scanner (System.in);
            int n=in.nextInt();
            int[] ar=new int[n];
        for (int i = 0; i < n; i++) {
            ar[i]=in.nextInt();
        }
        int num=in.nextInt();
        boolean isAsc=ar[0]<ar[n-1];
        int st=0;
        int end=n-1;
        int mid;int c=0;
        while(st<=end)
        {
            mid=(st+end)/2;
            if(ar[mid]==num) {
                System.out.println(mid);
                c++;
                break;
            }
            if(isAsc)
            {
                if(ar[mid]>num)
                    end=mid-1;
                else
                    st=mid+1;
            }
            else
            {
                if(ar[mid]>num)
                    st=mid+1;
                else
                    end=mid-1;
            }
        }
        if(c==0)
            System.out.println("Element not found");
    }
}
