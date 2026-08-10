package JavaByKK.Recursion;

public class BinarySearchUsingRecursion {
    public static void main(String[] args) {
        int[] ar = {2, 3, 4, 6, 7, 9, 11};
        System.out.println(search(ar, 9, 0, ar.length - 1));
    }
    public static int search(int[] ar,int element, int start, int end) {
        if(start > end) {
            return -1;
        }
        int mid = (start + end) / 2;
        if(ar[mid] == element) {
            return mid;
        }
        if(ar[mid] > element) {
            return search(ar, element, start, mid - 1);
        }
        return search(ar, element, mid + 1, end);
    }
}
