package JavaByKK.OOPS.inheritnce;

public class I10 extends Hyundai{
    boolean powerStearing;
    int model;
    String color;

    I10() {
        super();
        powerStearing = false;
        model = 2012;
        color = "White";
    }

    I10(int cost, double milage, boolean automatic, String owner, double interest, boolean powerStearing, int model, String color) {
        super(cost, milage, automatic, owner, interest);
        this.powerStearing = powerStearing;
        this.model = model;
        this.color = color;
    }
}
