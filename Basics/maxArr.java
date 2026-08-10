package JavaByKK;

public class maxArr {
    public static void main(String[] args) {
        int[] arr={13, 2, 56, 57, 45, 234};
        System.out.println(max(arr));
    }
    static int max(int[] arr) {
        int m=arr[0];
        for (int i : arr) {
            if (m < i)
                m = i;
        }
        return m;
    }
}