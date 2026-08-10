import java.util.ArrayList;
import java.util.List;

public class SubsetIteration {
    public static void main(String[] args) {
        int[] ar = {1, 2, 3};
        System.out.println(subset(ar));
    }

    static List<List<Integer>> subset(int[] ar) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int num : ar) {
            int n = outer.size();
            for(int i = 0; i < n; i++) {
                List<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(num);
                outer.add(inner);
            }
        }
        return outer;
    }
}
