package JavaByKK;
import java.util.*;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=in.nextInt();
        }
        int num=in.nextInt();
        System.out.println(linear(arr,num));
    }
    static int linear(int[] arr, int num) {
        int a=-1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==num)
            {  a=i;
                return a;}
        }
        return -1;

    }
}
