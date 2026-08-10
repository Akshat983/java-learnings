package JavaByKK.OOPS.staticExample;

public class StaticBlockNewConcept {
    static int a = 5;
    static int b;

    StaticBlockNewConcept() {
        System.out.println("I am in Constructor");
    }
    //will only run once when the first object is created i.e, when the class is loaded for the first time
    static {
        System.out.println("I am in static block");
        b = a*5;
    }

    public static void main(String[] args) {
        StaticBlockNewConcept obj = new StaticBlockNewConcept();
        StaticBlockNewConcept obj2 = new StaticBlockNewConcept();
        System.out.println(a + " " + b);
    }
}
