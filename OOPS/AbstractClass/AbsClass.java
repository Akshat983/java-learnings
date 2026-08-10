package JavaByKK.OOPS.AbstractClass;

//initialized with keyword abstract (All functions must be abs) and all functions must be inherited
public abstract class AbsClass {
    abstract void hello();
    abstract void bye();
    abstract void work();
    void normal() {
        System.out.println("I am normal");
    }
    static void falana() {
        System.out.println("Falane");
    }
}
