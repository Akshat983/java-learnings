package JavaByKK.OOPS.InnerClass;
//outer class can't be static as it has no class to depend upon
public class InnerClasses {
    static class Test {
        String name;
        public Test(String name) {
            this.name = name;
        }

//        @Override
//        public String toString() {
//            return name;
//        }
    }

    static void main() {
        Test ic = new Test("Akshat");
        Test ic2 = new Test("Abhay");
        System.out.println(ic.name);
        System.out.println(ic2.name);
        System.out.println(ic);
    }
}