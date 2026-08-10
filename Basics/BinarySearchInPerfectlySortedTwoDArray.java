package JavaByKK;

import java.util.Arrays;

public class BinarySearchInPerfectlySortedTwoDArray {
    public static void main(String[] args) {
        int[][] ar = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        int target = 45;
        System.out.println(Arrays.toString(binarySearch(ar, target)));
    }

    //normal binary search
    static int[] search(int[][] ar, int target, int row, int cStart, int cEnd) {
        while (cStart <= cEnd) {
            int cMid = cStart + (cEnd - cStart) / 2;
            if (ar[row][cMid] == target)
                return new int[]{row, cMid};
            else if (ar[row][cMid] < target)
                cStart = cMid + 1;
            else cEnd = cMid - 1;
        }
        return new int[]{-1, -1};
    }

    //binary search in 2D Array
    static int[] binarySearch(int[][] ar, int target) {
        if (ar.length == 1)
            return search(ar, target, 0, 0, ar[0].length);

        int rStart = 0;
        int rEnd = ar.length - 1, cEnd = ar[0].length - 1;
        int rMid;
        int cMid = cEnd / 2;
        while (rEnd - rStart >= 2) {
            rMid = rStart + (rEnd - rStart) / 2;
            if (ar[rMid][cMid] == target) {
                return new int[]{rMid, cMid};
            } else if (ar[rMid][cMid] < target) {
                rStart = rMid;
            } else {
                rEnd = rMid;
            }
        }

        if (ar[rStart][cMid] > target) {
            return search(ar, target, rStart, 0, cMid - 1);
        } else if (ar[rStart + 1][cMid] < target) {
            return search(ar, target, rStart + 1, cMid + 1, cEnd);
        }
            int[] ans = search(ar, target, rStart, cMid + 1, cEnd);
            if (ans[0] == -1)
                return search(ar, target, rStart + 1, 0, cMid - 1);
            return new int[] {-1, -1};

    }
}