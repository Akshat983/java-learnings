package JavaByKK.Recursion;
import java.util.*;


public class NumberExampleRecursion{
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    print(n);
    }

    private static void print(int n) {
        if(n == 1) {                // Base condition
            System.out.println(1);
            return;
        }
            print(n - 1);
            System.out.println(n);

    }
}
