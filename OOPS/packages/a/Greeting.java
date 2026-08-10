package JavaByKK.OOPS.packages.a;

import static JavaByKK.OOPS.packages.b.Message.message; //we are importing a funcion from another package

public class Greeting {
    public static void main(String[] args) {
        System.out.println("Hello");
        message();
    }
}
