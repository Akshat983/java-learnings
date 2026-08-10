package JavaByKK.Recursion;
import java.util.*;
public class BubbleSort {
    public static void main(String[] args) {
        int[] ar = {4, 1, 6, 2, 8, 3, 5, 9, 7};
        sort(ar, 0, ar.length-1);
        System.out.println(Arrays.toString(ar));
    }
    static void swap(int[] ar, int a, int b) {
        int t = ar[a];
        ar[a] = ar[b];
        ar[b] = t;
    }
    static void sort(int[] ar, int st, int end) {
        if(end == 0) {
            return;
        }
        if(st == end) {
            sort(ar, 0, end-1);
        }
        else {
            if (ar[st] > ar[st + 1]) {
                swap(ar, st, st + 1);
            }
            sort(ar, st + 1, end);
        }
    }
}
