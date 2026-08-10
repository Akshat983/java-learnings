package JavaByKK.OOPS.ExceptionHandling;

public class Main {
    static void main() {
        int a = 5;
        int b = 0;
        try {
            int c = a/b;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("It always executes even if no exception");
        }
    }
}
