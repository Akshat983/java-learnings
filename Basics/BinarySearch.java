package JavaByKK;

public class BinarySearch {
    public static void main(String[] args) {
        int[] ar={5,7,7,8,8,10};
        int target=8;
        System.out.println(search(ar,target));
    }
    static int search(int[] ar, int t) {
        int start=0,mid,end=ar.length-1;
        while(start<=end)
        {
            mid=(start+end)/2;
            if(ar[mid]==t)
                return mid;
            else if(ar[mid]<t)
                start=mid+1;
            else
                end=mid-1;
        }
        return -1;
    }
}
