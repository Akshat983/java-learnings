package JavaByKK.OOPS.Polymorphism;

public class Addition {
    int sum(int a, int b) {
        return a+b;
    }
    //STATIC POLYMORPHISM ->  "FUNCTION OVERLOADING"
    int sum(int a, int b, int c) {
        return a+b+c;
    }

    static void main() {
        Addition ob = new Addition();
        System.out.println(ob.sum(3, 7, 9));
    }
}
