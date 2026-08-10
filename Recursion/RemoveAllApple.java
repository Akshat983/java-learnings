package JavaByKK.Recursion;

public class RemoveAllApple {
    public static void main(String[] args) {
        String st = "bccabappleadh";
        System.out.println(removeAllApple(st));
    }
    static String removeAllApple(String up) {
        if(up.isEmpty()) {
            return "";
        }
        if(up.startsWith("apple")) {
            return removeAllApple(up.substring(5));
        }
        return up.charAt(0) + removeAllApple(up.substring(1));
    }
}
