package JavaByKK.Recursion;

import java.util.Arrays;

public class MergeSortInPlace {
    public static void main(String[] args) {
        int[] ar = {3, 6, 2, 1, 6, 9 ,7};
        mergeSortInPlace(ar, 0, ar.length);
        System.out.println(Arrays.toString(ar));
    }
    static void mergeSortInPlace(int[] ar, int s, int e) {
        if(e - s == 1) {
            return;
        }
        int mid = (s + e) / 2;
        mergeSortInPlace(ar, s, mid);
        mergeSortInPlace(ar, mid, e);
        merge(ar, s, mid, e);
    }
    static void merge(int[] ar, int s, int m, int e) {
        int[] mix = new int[e-s];
        int i = s;
        int j = m;
        int k = 0;
        while(i < m && j < e) {
            if(ar[i] > ar[j]) {
                mix[k] = ar[j];
                j++;
            }
            else {
                mix[k] = ar[i];
                i++;
            }
            k++;
        }
        while(i < m) {
            mix[k] = ar[i];
            i++;
            k++;
        }
        while(j < e) {
            mix[k] = ar[j];
            j++;
            k++;
        }
        for (int l = 0; l < mix.length; l++) {
            ar[s + l] = mix[l];
        }
    }
}
