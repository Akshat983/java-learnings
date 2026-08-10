package JavaByKK.Recursion;

import java.util.ArrayList;

public class SubseqReturnAscii {
    public static void main(String[] args) {
        String st = "abc";
        System.out.println(subseqascii(st, ""));
    }
    static ArrayList<String> subseqascii(String up, String p) {
        if(up.isEmpty()) {
            ArrayList<String> l = new ArrayList<>();
            l.add(p);
            return l;
        }
        ArrayList<String> left = subseqascii(up.substring(1), p + up.charAt(0));
        ArrayList<String> mid = subseqascii(up.substring(1), p);
        ArrayList<String> right = subseqascii(up.substring(1), p + (int)up.charAt(0));
        left.addAll(right);
        left.addAll(mid);
        return left;
    }
}
