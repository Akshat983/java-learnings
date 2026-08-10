import java.util.*;
public class SubsetWithDupli {
    public static void main(String[] args) {
        int ar[] = {1, 2, 2};
        Arrays.sort(ar);
        System.out.println(subset(ar));
    }
    static List<List<Integer>> subset(int[] ar) {
        List<List<Integer>> out = new ArrayList<>();
        out.add(new ArrayList<>());
        int s;
        int e = 0;
        for(int i = 0; i < ar.length; i++) {
            s = 0;
            if(i != 0 && ar[i] == ar[i-1]) {
                s = e + 1;
            }
            e = out.size() - 1;
            for(int j = s; j <= e; j++) {
                List<Integer> in = new ArrayList<>(out.get(j));
                in.add(ar[i]);
                out.add(in);
            }
        }
        return out;
    }
}
