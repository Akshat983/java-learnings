package JavaByKK.Recursion;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] ar = {6, 2, 4, 5, 3, 1};
        quickSort(ar, 0, ar.length - 1);
        System.out.println(Arrays.toString(ar));
    }

    static void quickSort(int[] ar, int lo, int hi) {
        if (lo >= hi) {
            return;
        }

        int s = lo;
        int e = hi;
        int m = (s + e) / 2;
        int pivot = ar[m];

        while (s <= e) {
            while (ar[s] < pivot) {
                s++;
            }
            while (ar[e] > pivot) {
                e--;
            }
            if (s <= e) {
                int t = ar[s];
                ar[s] = ar[e];
                ar[e] = t;
                s++;
                e--;
            }
        }

        quickSort(ar, lo, e);
        quickSort(ar, s, hi);
    }
}

