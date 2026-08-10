package JavaByKK.OOPS;

public class WrapperClass {
    public static void main(String[] args) {
//        int a = 20;
//        int b = 10;
//        swap(a, b);
//        System.out.println(a + " " + b);  // swap will not be performed as primitives are called by value

//        Integer a = 20;
//        Integer b = 10;
//        swap(a, b);
//        System.out.println(a + " " + b); //a and b are still not swapped bcoz objects via wrapper class are made using "final" keyword
        final float PI = 3.14f;
//        PI = 2; // gives error becoz variables declared using final keyword can't be changed

        final A kunal = new A("Akshat");
        // when a non primitive is final then we cant reassign but we can change the object internally
        kunal.name ="Other name";
//        System.out.println(kunal.name);
        A obj;
        for (int i = 0; i < 1000000; i++) {
            obj = new A("Random name");
        }

    }
//    static void swap(int a, int b) {
//        int t = a;
//        a = b;
//        b = t;
//    }
    static void swap(Integer a, Integer b) {
        Integer t = a;
        a = b;
        b = t;
    }

}
class A {
    final int num = 10;
    String name;
    A(String name) {
//        System.out.println("Object created");
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {  // this will run at the time when garbage collection hits
        System.out.println("Object destroyed");
    }
}
