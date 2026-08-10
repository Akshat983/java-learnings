package JavaByKK.OOPS.EnumExamples;

public class Main {
    enum Week implements A{
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday;
        //These are ENUM CONSTANTS
        //these are public, static and final
        //Since, this is final so we can't create a child of it
        //It is of type Week

        Week() {
            System.out.println("Constructor is called for " + this);
        }

        @Override
        public void hello() {
            System.out.println("Hello how are you");
        }
    }

    static void main() {
        Week day = Week.Monday;

//        for(Week d : Week.values()) {
//            System.out.println(d);
//        }

//        System.out.println(day.ordinal());

        day.hello();
    }
}
