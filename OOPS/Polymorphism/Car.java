package JavaByKK.OOPS.Polymorphism;

public class Car {
    int cost;
    double milage;
    boolean automatic;

    Car() {
        this(-1, -1, false);
    }

    //Same constructor name, i.e., "STATIC POLYMORPHISM"
    //While creating an object or calling a function java decides which function or which constructor we are calling, therefore, STATIC
    Car(int cost, double milage, boolean automatic) {
        this.cost = cost;
        this.milage = milage;
        this.automatic = automatic;
    }

    public void havingFun() {
        System.out.println("Great Car!");
    }
}



