package JavaByKK.OOPS.inheritnce;

public class User {
    static void main() {
        Hyundai ob = new Hyundai(1000000, 12.9, true, "Lalu Prasad", 11.0);

        System.out.println(ob.cost);
        ob.havingFun();

        Car ob1 = new Hyundai(1200000, 11.5, false, "Owaisi", 15.5);        //  Possible!!
//        Hyundai ob2 = new Car();      // Not Possible as child ob can not have its father's object to initialize it

        ob1.havingFun();
//        System.out.println(ob1.owner);    //Not Possible!!  we can't access child from parent's object but vice versa is possible


        // MULTI-LEVEL INHERITANCE
        I10 obj = new I10();
        obj.havingFun();

    }
}
