package JavaByKK.OOPS.ObjCloning.ShallowNDeepCopy;

import java.util.Arrays;

public class Main {
    static void main() throws CloneNotSupportedException{
        Human akshat = new Human(21, "Akshat");

        Human twin = (Human) akshat.clone();
        twin.arr[4] = 55;

        System.out.println(Arrays.toString(twin.arr));
        System.out.println(Arrays.toString(akshat.arr));
    }
}
