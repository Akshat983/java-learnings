package JavaByKK;

import java.util.Arrays;

public class BinarySearchTwoDArray {
    public static void main(String[] args) {
        int[][] ar = {
                { 10, 15, 20, 25},
                { 12, 16, 21, 26},
                { 13, 18, 22, 28},
                { 14, 19, 24, 29}
        };
        int target = 28;
        System.out.println(Arrays.toString(binarySearch1(ar, target)));
    }

    //normal binary search
    static int[] search (int[][] ar, int target, int row, int cStart, int cEnd) {
        while (cStart <= cEnd)
        {
            int cMid = cStart + (cEnd - cStart) / 2;
            if (ar[row][cMid] == target)
                return new int[] {row, cMid};
            else if (ar[row][cMid] < target)
                cStart = cMid + 1;
            else cEnd = cMid - 1;
        }
        return new int[] {-1, -1};
    }

    //binary search in 2D Array
    static int[] binarySearch (int[][] ar, int target)
    {
        if (ar.length == 1)
            return search(ar, target, 0, 0, ar[0].length);

        int cEnd = ar[0].length - 1;
        int rStart = 0;
        while (cEnd >= 0 && rStart < ar.length)
        {
            int element = ar[rStart][cEnd];
            if (element == target)
                return new int[] {rStart, cEnd};
            else if (element < target)
                rStart ++;
            else cEnd --;
        }
        return new int[] {-1, -1};
    }

    //more optimized by me
    static int[] binarySearch1 (int[][] ar, int target)
    {
        if (ar.length == 1)
            return search(ar, target, 0, 0, ar[0].length);

        int cEnd = ar[0].length - 1, cStart = 0;
        int rStart = 0;
        while (cEnd >= 0 && rStart < ar.length)
        {

            int cMid = cStart + (cEnd - cStart) / 2;
            if(ar[0][cMid] > target)
            {
                cEnd=cMid=1;
                continue;
            }
            int element = ar[rStart][cEnd];
            if (element == target)
                return new int[] {rStart, cEnd};
            else if (element < target)
                rStart ++;
            else cEnd --;
        }
        return new int[] {-1, -1};
    }
}
