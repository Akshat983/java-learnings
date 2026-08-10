package JavaByKK.OOPS.ExceptionHandling;

public class Main2 {
    static void main() {
        int a = 5;
        int b = 0;
        try{
//            int c = divide(a, b);
            throw new MyException("Falane");
        } catch (MyException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("I am Normal Exception");
        } finally {
            System.out.println("I'll always run");
        }
    }
    static int divide(int a, int b) throws Exception{
        if(b == 0) {
            throw new Exception("Don't divide by zero");
        }
        return a/b;
    }
}