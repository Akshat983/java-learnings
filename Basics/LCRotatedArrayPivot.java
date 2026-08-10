package JavaByKK;

public class LCRotatedArrayPivot {
    public static void main(String[] args) {
        int[] ar={};
        System.out.println(pivot(ar));
    }

    public static int pivot(int[] ar) {
        int st=0,end=ar.length-1,mid=0;
        while(st!=end) {
            mid=(st+end)/2;
            if(mid<end && ar[mid]>ar[mid+1]) {
                return mid;
            }
            if(end>=0 && ar[mid]>ar[end])
                st=mid;
            else end=mid;
        }
        return -1;
    }
}
