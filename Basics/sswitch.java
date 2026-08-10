
    package JavaByKK;
import java.util.*;
    public class sswitch {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter fruit: ");
            String f = in.next();
            switch (f) {
                case "Apple" -> System.out.println("Keeps doctor away");
                case "Banana" -> System.out.println("Liked by teenagers");
                case "Grapes" -> System.out.println("small but juicy");
                default -> System.out.println("wrong fruit entered");
            }
        }

    }
