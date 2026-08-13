package JavaByKK.MathsForDSA.src;

import java.util.ArrayList;

public class Factors {
    public static void main(String[] args) {
        int n = 20;
        factors(n);
    }
    public static void factors(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i*i < n; i++) {
            if(n%i == 0) {
//                System.out.print(i + " " + n/i + " ");  this was printing in unsorted manner
                System.out.print(i + " ");
                list.add(n/i);
            }
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
    }
}
