package JavaByKK.OOPS.ObjectClass;

//Every class inherits object class by default
public class ObjectEx {
    int num;
    float gpa;

    public ObjectEx(int num, float gpa) {
        this.num = num;
        this.gpa = gpa;
    }

    //Modified this hashCode method of Object class
    @Override
    public int hashCode() {
        return (int)(num+gpa);
    }

    @Override
    public boolean equals(Object obj) {
        return this.num == ((ObjectEx)obj).num;
    }

    //Already learned
//    @Override
//    public String toString() {
//        return super.toString();
//    }

    //Already learned that this runs when garbage cllector hits
//    @Override
//    protected void finalize() throws Throwable {
//        super.finalize();
//    }

    static void main() {
        ObjectEx ob1 = new ObjectEx(24, 8.9f);
        ObjectEx ob2 = new ObjectEx(24, 2.9f);;
//        System.out.println(ob1 == ob2);
//        System.out.println(ob1.equals(ob2));

        //getClass method
        System.out.println(ob1.getClass());
    }

}
