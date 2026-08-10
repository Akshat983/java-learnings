package JavaByKK;

public class leetcodeFirstAndLastOccurance {
    public static void main(String[] args) {
        int[] ar={};
        int t=8;
        fnl(ar,t);
    }

    static void fnl(int[] ar, int t) {
        int l= ar.length;

        // for first index
        int st=0,end=l-1;
        while(st<=end)
        {
            int mid=(st+end)/2;
            if(ar[mid]>=t)
                end=mid-1;
            else st=mid+1;
        }
        if(st<l&&ar[st]==t)
            System.out.println(st);
        else
            System.out.println(-1);

        // for end index
        st=0;end=l-1;
        while(st<=end)
        {
            int mid=(st+end)/2;
            if(ar[mid]>t)
                end=mid-1;
            else st=mid+1;
        }
        if(end>=0&&ar[end]==t)
            System.out.println(end);
        else
            System.out.println(-1);
    }
}
