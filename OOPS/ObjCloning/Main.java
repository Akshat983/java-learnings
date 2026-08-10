package JavaByKK.OOPS.ObjCloning;

public class Main {

    static void main() throws CloneNotSupportedException{
        Human akshat = new Human(21, "Akshat");

//        High Overhead on this way of cloning
//        Human twin = new Human(Akshat);

        Human twin = (Human) akshat.clone();
        System.out.println(twin.age + " " + twin.name);
    }
}
