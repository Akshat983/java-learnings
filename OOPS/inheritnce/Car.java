package JavaByKK.OOPS.inheritnce;

//putting a class as FINAL restricts it from getting Inherited
public class Car {
    int cost;
    double milage;
    boolean automatic;

    Car() {
        this(-1, -1, false);
    }

    Car(int cost, double milage, boolean automatic) {
        this.cost = cost;
        this.milage = milage;
        this.automatic = automatic;
    }

    public void havingFun() {
        System.out.println("Great Car!");
    }
}



