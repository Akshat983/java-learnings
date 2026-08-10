package JavaByKK.Recursion;

public class RemoveAllA {
    public static void main(String[] args) {
        String s = "abccab";
        StringBuilder build = new StringBuilder();
        removeAllA(s, build, s.length());
        System.out.println(build.toString());
    }
    static void removeAllA(String s, StringBuilder build, int l) {
        if(l == 0) {
            return;
        }
        if(s.charAt(s.length() - l) == 'a') {
            removeAllA(s, build, l-1);
            return;
        }
        build = build.append(s.charAt(s.length() - l));
        removeAllA(s, build, l-1);
    }
}
