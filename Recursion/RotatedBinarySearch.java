package JavaByKK.Recursion;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] ar = {5, 6, 7, 8, 9, 1, 2, 3};
        int key = 9;
        System.out.println(search(ar, key, 0, ar.length-1));
    }
    static int search(int[] ar, int key, int st, int end) {
        int mid = st + (end-st)/2;
        if(ar[mid] == key) {
            return mid;
        }
        if(st >= end) {
            return -1;
        }
        if((key > ar[mid] && key > ar[st]) || (key < ar[mid] && key < ar[st])) {
            return search(ar, key, mid+1, end);
        }
        return search(ar, key, st, mid-1);
    }
}
