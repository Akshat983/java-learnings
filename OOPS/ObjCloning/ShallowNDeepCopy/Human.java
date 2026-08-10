package JavaByKK.OOPS.ObjCloning.ShallowNDeepCopy;

public class Human implements Cloneable{
    int age;
    String name;
    int[] arr;

    Human(int age, String name) {
        this.age = age;
        this.name = name;
        arr = new int[] {1, 2, 3, 4, 5};
    }

//    THIS IS SHALLOW COPY, I.E., IF WE MAKE A CHANGE IN ONE VALUE OF THE NON-PRIMITIVE'S OBJECT IT WILL REFLECT ON OTHER (CLONE)
//    public Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }

//    THIS IS DEEP COPY
    public Object clone() throws CloneNotSupportedException {
        Human twin = (Human) super.clone();
        twin.arr = new int[this.arr.length];

        for (int i = 0; i < this.arr.length; i++) {
            twin.arr[i] = this.arr[i];
        }

        return twin;
    }
}
