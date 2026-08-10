package JavaByKK.OOPS.Polymorphism.DynamicPolymorphism;

public class Circle extends Shapes {

    @Override   //this is only used to check whether this method is being overridden or not (Not of any new use)
    void area() {
        System.out.println("pi * r * r");
    }
}
