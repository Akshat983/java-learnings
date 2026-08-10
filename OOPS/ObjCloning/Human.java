package JavaByKK.OOPS.ObjCloning;

public class Human implements Cloneable{
    int age;
    String name;

    Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

//    THIS HAS HIGH OVERHEAD (TAKES MORE TIME AND SPACE AS CREATED BY NEW KEYWORD)
    Human(Human human) {
        this.age = human.age;
        this.name = human.name;
    }

//    BEST WAY OF CLONING
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
