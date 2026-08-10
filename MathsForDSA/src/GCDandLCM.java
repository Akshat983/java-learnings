public class GCDandLCM {
    public static void main(String[] args) {
        int a = 8, b = 10;
        System.out.println(a > b? lcm(b, a) : lcm(a, b));
    }
    static int gcd(int a, int b) {
        if(a == 0) {
            return b;
        }
        return gcd(b % a, a);
    }

    static int lcm(int a, int b) {
        int hcf = gcd(a, b);
        return (a / hcf) * (b / hcf) * hcf;
    }
}
