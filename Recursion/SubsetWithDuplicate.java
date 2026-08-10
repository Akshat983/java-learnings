package JavaByKK.Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetWithDuplicate {
    public static void main(String[] args) {
        int[] ar = {3, 4, 2, 2, 4};
        Arrays.sort(ar);
        System.out.println(subsetDup(ar));
    }
    static List<List<Integer>> subsetDup(int[] ar) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int s = 0;
        int e = 0;
        for(int i = 0; i < ar.length; i++) {
            int size = outer.size();
            s = 0;
            if(i > 0 && ar[i] == ar[i-1]) {
                s = e+1;
            }
            e = outer.size()-1;
            for (int j = s; j < size; j++) {
                List<Integer> inner = new ArrayList<>(outer.get(j));
                inner.add(ar[i]);
                outer.add(inner);
            }
        }
        return outer;
    }
}
