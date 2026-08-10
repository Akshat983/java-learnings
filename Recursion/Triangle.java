package JavaByKK.Recursion;

public class Triangle {
    public static void main(String[] args) {
        pattern1(3, 0);
        pattern2(3, 0);
    }
    static void pattern1(int i, int j) {
        if(i == 0) {
            return;
        }
        if(j<i) {
            System.out.print("*");
            pattern1(i, j+1);
        }
        else {
            System.out.println();
            pattern1(i - 1, 0);
        }
    }
    static void pattern2(int i, int j) {
        if(i == 0) {
            return;
        }
        if(j<i) {
            pattern2(i, j+1);
            System.out.print("*");
        }
        else {
            pattern2(i - 1, 0);
            System.out.println();
        }
    }
}
