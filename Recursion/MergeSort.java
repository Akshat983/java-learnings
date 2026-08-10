package JavaByKK.Recursion;
import java.util.*;
public class MergeSort {
    public static void main(String[] args) {
        int[] ar = {6, 5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(mergeSort(ar)));
    }
    static int[] mergeSort(int[] ar) {
        if(ar.length == 1) {
            return ar;
        }
        int mid = ar.length / 2;
        int[] left = Arrays.copyOfRange(ar, 0, mid);
        int[] right = Arrays.copyOfRange(ar, mid, ar.length);
        return merge(mergeSort(left), mergeSort(right));
    }
    static int[] merge(int[] first, int[] second) {
        int[] ar = new int[first.length + second.length];
        int i = 0, j = 0, k = 0;
        while(i < first.length && j < second.length) {
            if(first[i] < second[j]) {
                ar[k] = first[i];
                i++;
            }
            else {
                ar[k] = second[j];
                j++;
            }
            k++;
        }
        while(i < first.length) {
            ar[k] = first[i];
            k++;
            i++;
        }
        while (j < second.length) {
            ar[k] = second[j];
            k++;
            j++;
        }
        return ar;
    }
}
