package JavaByKK;

public class LCSplitArrayLargestSum {
    public static void main(String[] args) {
        int[] arr = { 7, 2, 5, 8, 10 };
        int m = 2;
        System.out.println( LargestSum( arr, m ) );
    }

    private static int LargestSum(int[] nums, int k) {
        int max = nums[0], sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if( max < nums[i] )
                max = nums[i];
        }
        int start = max, end = sum;
        while (start < end)
        {
            int mid=start+(end-start)/2;
            sum=0;
            int peices=1;
            for(int num : nums)
            {
                if(sum+num>mid)
                {
                    sum=num;
                    peices++;

                }
                else {
                    sum+=num;
                }
            }
            if(peices>k)
                start=mid+1;
            else end=mid;
        }
        return end;
    }
}
