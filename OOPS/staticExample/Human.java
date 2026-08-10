package JavaByKK.OOPS.staticExample;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population; // static methods and variables are common to all the objects

    static void message() {
        System.out.println("Hello");
    }

    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        this.population+=1; // this refers to object so it should not be use with static members
        Human.message(); // or directly message();
    }
}
