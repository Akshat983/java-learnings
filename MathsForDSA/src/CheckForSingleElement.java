public class CheckForSingleElement {
    public static void main(String[] args) {
        int[] ar = {2, 3, 4, 1, 2, 1, 3, 6, 4};
        int ans = 0;
        for (int i = 0; i < ar.length; i++) {
            ans ^= ar[i];     //any number ^(XOR) same number = 0
        }
        System.out.println(ans);
    }
}
