package JavaByKK;
import java.util.*;

public class RevArr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=in.nextInt();
        }
        swap(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr) {
        for (int i = 0; i < arr.length/2; i++) {
            int t=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=t;
        }
    }
}
