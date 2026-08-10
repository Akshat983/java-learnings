package JavaByKK.Recursion;

public class CheckSorted {
    public static void main(String[] args) {
        int[] ar = {0, 3, 5, 8, 6};
        System.out.println(isSorted(ar));
    }
    static boolean isSorted(int[] ar) {
        if(ar.length == 1) {
            return true;
        }
        return helper(ar, 0);
    }
    static boolean helper(int[] ar, int idx) {
        int l = ar.length;
        if(idx == l-1) {
            return true;
        }
        if(ar[idx] > ar[idx+1]){
            return false;
        }
        return helper(ar, idx+1);
    }
}
