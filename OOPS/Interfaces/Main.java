package JavaByKK.OOPS.Interfaces;

public class Main {
    static void main() {
//        Car ob = new Car();
//        ob.acc();
//        ob.start();
//        ob.stop();


        BetterCar ob = new BetterCar();
        ob.start();
        ob.startMusic();
        ob.upgradeEngine();
        ob.stop();
    }
}
