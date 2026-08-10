package JavaByKK.OOPS.Generics.Compare;

public class Main {
    static void main() {
        Student Akshat = new Student(142, 99);
        Student Ramesh = new Student(122, 67);
        System.out.println("Marks difference = " + Akshat.compareTo(Ramesh));
    }
}
