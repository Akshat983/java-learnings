package JavaByKK.Recursion;

import java.util.ArrayList;

public class SubSequence {
    public static void main(String[] args) {
        String s = "abc";
        subseq(s, "");
        System.out.println(subseqReturn(s, ""));
    }
    static void subseq(String up, String p) {
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }
        subseq(up.substring(1), p + up.charAt(0));
        subseq(up.substring(1), p);
    }
    static ArrayList<String> subseqReturn(String up, String p) {
        if(up.isEmpty()) {
            ArrayList<String> l = new ArrayList<>();
            l.add(p);
            return l;
        }
        char c = up.charAt(0);
        ArrayList<String> left = subseqReturn(up.substring(1), p + c);
        ArrayList<String> right = subseqReturn(up.substring(1), p);
        left.addAll(right);
        return left;
    }
}
