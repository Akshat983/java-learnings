package JavaByKK;

import java.util.Arrays;

public class TwoDsearch {
    public static void main(String[] args) {
        int[][] ar={
                {1,3,454,323,33},
                {5,7,342,4},
                {35,78,65,3,12},
                {44,45,67,78,654,43,2134,9999}
        };
        int target=999896;
        System.out.println(Arrays.toString(search(ar,target)));
    }

    static int[] search(int[][] ar, int target) {
        int a=0,b=0;
        for(int[] i : ar)
        {
            b=0;
            for(int j : i)
            {
                if(target==j)
                    return new int[]{a,b};
                b++;
            }
            a++;
        }
        return new int[]{-1,-1};
    }
}
