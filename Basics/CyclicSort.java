package JavaByKK;

import java.util.Arrays;

class CyclicSort {
    public static void main(String[] args) {
        int[] ar = {1 ,3 ,4, 5, 2};
        cyclicSort(ar);
        System.out.println(Arrays.toString(ar));
    }

    static void swap(int[] ar, int first, int second) {
        int temp = ar[first];
        ar[first] = ar[second];
        ar[second] = temp;
    }

    static void cyclicSort(int[] ar) {
        int i = 0;
        while (i < ar.length) {
            int correct = ar[i] - 1;
            if(ar[i] != ar[correct]) {
                swap(ar, i, correct);
            }
            else {
                i++;
            }
        }
    }
}