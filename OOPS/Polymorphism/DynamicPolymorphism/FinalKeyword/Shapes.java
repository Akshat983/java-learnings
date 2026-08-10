package JavaByKK.OOPS.Polymorphism.DynamicPolymorphism.FinalKeyword;

// DYNAMIC POLYMORPHISM is also known as "METHOD OVERRIDING"

public class Shapes {

    void area() {
        System.out.println("I am in shapes");
    }


    // "FINAL" keyword help to restrict function to be overridden
    // This is known as "EARLY BINDING"  as java now knows at the compile time that which method we have to restrict from overriding
//    public final void area() {
//        System.out.println("I am in shapes");
//    }

}

