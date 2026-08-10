package JavaByKK;

public class KadaneAlgoForMaxSubarr {
    static void main() {
        int[] ar = new int[]{-4, 6, 1, -9, 2, 4};
        System.out.println(kadane(ar));
    }
    static int kadane(int[] ar) {
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        for(int i : ar){
            currsum += i;
            if(currsum > maxsum) {
                maxsum = currsum;
            }
            if(currsum < 0) {
                currsum = 0;
            }
        }
        return maxsum;
    }
}
