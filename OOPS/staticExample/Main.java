package JavaByKK.OOPS.staticExample;

public class Main {
    public static void main(String[] args) {
        Human akshat = new Human(20, "Akshat", 200000, false);
        System.out.println(akshat.salary);
        Human kunal = new Human(22, "Kunal", 500000, false);
        Human arpit = new Human(22, "Arpit", 500000, false);
        System.out.println(akshat.population); //can also be accessed by Human.population(best way)
//        System.out.println(Human.population);
//        we can access static members without even creating objects that is also a reason why main method is static
        Main obj = new Main();
        obj.fun2();
    }
    static void fun() {
//        greeting(); // you cannot use it because it requires an instance(object)
        //but the function you are using, it does not depend on instance
        Main ob = new Main();
        ob.greeting();
    }
    void fun2() {
        greeting();//possible
    }
    void greeting() {
//        fun();                            //this is possible
        System.out.println("Hello");
    }
}
