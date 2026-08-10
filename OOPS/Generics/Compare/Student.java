package JavaByKK.OOPS.Generics.Compare;

public class Student implements Comparable<Student>{
    int rollno;
    int marks;

    public Student(int rollno, int marks) {
        this.rollno = rollno;
        this.marks = marks;
    }
    @Override
    public int compareTo(Student o) {
        return (int)(this.marks - o.marks);
    }
}
