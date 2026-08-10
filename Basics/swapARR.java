package JavaByKK;

import java.util.Arrays;

public class swapARR {
    public static void main(String[] args) {
        int[] ar={1, 2, 3, 4, 5};
        swap(ar,1,4);

        System.out.println(Arrays.toString(ar));
    }
    static void swap(int[] arr,int idx1,int idx2)
    {
        int temp=arr[idx1];
        arr[idx1]=arr[idx2];
        arr[idx2]=temp;
    }
}
