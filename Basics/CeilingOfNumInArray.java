package JavaByKK;

public class CeilingOfNumInArray {
    public static void main(String[] args) {
        int[] ar={21,45,66,76,79,81,86,98};
        int n=ar.length;
        int num=22;
        //Applying binary search
        int st=0,end=n-1,mid,c=0;
        while(st<=end)
        {
            mid=(st+end)/2;
            if(ar[mid]==num) {
                System.out.println(num+" at index "+mid);
                c++;
                break;
            }
            else if(ar[mid]>num)
                end=mid-1;
            else
                st=mid+1;
        }
        if (c==0&&st>=0&&st<n)
            System.out.println(ar[st]+" at index "+st);
        if(c==0&&(st<0||st>=n))
            System.out.println("Ceiling not present");
    }
}
