package JavaByKK.OOPS;

public class Intro {
    public static void main(String[] args) {
        Student akshat = new Student(8, "Akshat", 89.3f);
        System.out.println(akshat.rno);
        System.out.println(akshat.name);
        System.out.println(akshat.marks);
        Student random = new Student(); // this will call Student constructor with no parameters
        System.out.println(random.name);
    }
}
class Student {
    int rno;
    String name;
    float marks;

    Student() {
        // this calls Student constructor below one by passing its values //
        this(-1, "Default person", 100.0f);
    }
    Student(int rno, String name, float marks) {
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }
}
