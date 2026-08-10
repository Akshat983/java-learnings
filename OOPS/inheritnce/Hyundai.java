package JavaByKK.OOPS.inheritnce;

public class Hyundai extends Car {
    String owner;
    double interest;

    Hyundai() {
        super();
        owner = "None";
        interest = -1;
    }

    Hyundai(int cost, double milage, Boolean automatic, String owner, double interest) {
        super(cost, milage, automatic);
        this.owner = owner;
        this.interest = interest;
    }
}
