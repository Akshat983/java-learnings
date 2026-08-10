package JavaByKK;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] ar = {1, 2, 3, 4, 5, -65, 0};
        insertionSort(ar);
        System.out.println(Arrays.toString(ar));
    }

    //insertion sort
    static void insertionSort(int[] ar) {
        for (int i = 1; i < ar.length; i++) {
            for (int j = i; j > 0; j--) {
                if(ar[j] < ar[j-1]) {
                    swap(ar, j, j-1);
                }
                else {
                    break;
                }
            }
        }
    }


    //swapping
    static void swap (int[] ar, int first, int second) {
        int temp = ar[first];
        ar[first] = ar[second];
        ar[second] = temp;
    }

    public static void bubbleSort(int[] ar) {
        for (int i = ar.length; i > 0; i--) {
            boolean hasMax = false;
            for (int j = 1; j < i; j++) {
                if(ar[j] < ar[j-1]) {
                    swap(ar, j, j-1);
                    hasMax = true;
                }
            }
            if(!hasMax)
                break;
        }
    }

    //find the max in array
    public static int maxValue(int[] ar, int start, int end) {
        int max = start;
        for (int i = start+1; i <= end; i++) {
            if(ar[i] > ar[max]) {
                max = i;
            }
        }
        return max;
    }

    //Selection Sort
    public static void selectionSort(int[] ar) {
        for (int i = ar.length - 1; i > 0; i--) {
            int max = maxValue(ar, 0, i);
            swap(ar, i, max);
        }

    }
}
