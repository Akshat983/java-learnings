package JavaByKK.Recursion;

public class RemoveAppNotApple {
    public static void main(String[] args) {
        String st = "bccappvbappledh";
        System.out.println(removeAppNotApple(st));
    }
    static String removeAppNotApple(String s) {
        if(s.isEmpty()) {
            return "";
        }
        if(s.startsWith("app") && !s.startsWith("apple")) {
            return removeAppNotApple(s.substring(3));
        }
        else {
            return s.charAt(0) + removeAppNotApple(s.substring(1));
        }
    }
}
