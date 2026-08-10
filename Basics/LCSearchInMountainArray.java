package JavaByKK;

public class LCSearchInMountainArray {
    public static void main(String[] args) {
        int[] arr={1,3,6,8,9,7,5,3,1,0};
        int t=3;
        int p=peak(arr);
        int pos=binarySearch(arr,t,0,p);
        if(pos==-1)
            pos=binarySearch(arr,t,p,arr.length-1);
        System.out.println(pos);

    }

    // Search the peak value
    static int peak(int[] arr)
    {
        int start=0,end=arr.length-1;
        while(start!=end)
        {
            int mid=(start+end)/2;
            if(arr[mid]>arr[mid+1])
                end=mid;
            else start=mid+1;
        }
        return start;
    }

    static int binarySearch(int[] ar,int num,int st,int end)
    {
        boolean isAsc=ar[st]<ar[end];
        int mid;
        while(st<=end)
        {
            mid=(st+end)/2;
            if(ar[mid]==num) {
                return(mid);
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
            return(-1);
    }
}
