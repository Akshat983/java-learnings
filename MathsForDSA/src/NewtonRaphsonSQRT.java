package JavaByKK.MathsForDSA.src;

public class NewtonRaphsonSQRT {
    public static void main(String[] args) {
        int n = 40;
        System.out.println(sqrt(n));
    }
    public static double sqrt(int n) {
        double x = n;
        double root;
        while (true) {
            root = (x + n/x) / 2;
            if(Math.abs(root - x) < 1) {//error
                break;
            }
            x = root;
        }
        return root;
    }
}
