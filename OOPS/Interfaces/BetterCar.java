package JavaByKK.OOPS.Interfaces;

public class BetterCar {
    private Engine engine;
    private Media media = new CDPlayer();
    BetterCar() {
        this.engine = new PowerEngine();
    }

    BetterCar(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        engine.start();
    }

    void stop() {
        engine.stop();
    }

    void startMusic() {
        media.start();
    }

    void stopMusic(){
        media.stop();
    }

    void upgradeEngine() {
        engine = new ElectricEngine();
    }
}
