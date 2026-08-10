package JavaByKK.OOPS.Polymorphism.DynamicPolymorphism;

public class Main {
    static void main() {
        Shapes ob = new Shapes();

        Shapes ob1 = new Circle();
        //Which function is going to be called depends on the child, i.e. Circle (in this case)  -> "UPCASTING"

        Shapes ob2 = new Square();

        //METHOD OVERRIDING (RUN TIME / DYNAMIC POLYMORPHISM) (LATE BINDING -> As JAVA determines which function has to run at the run-time)

        //If the reference variable has the name of the function that we are calling then only we will be able to access it
        //And the method that we will access will be the method inside the referenced (declared) variable

        ob.area(); // call area function in Shapes

        ob1.area(); // calls area in Circle
        //Here if Shapes doesn't have function named area then it will be giving an error although circle has it because reference variable is of type Shapes.
        //And if shapes has function named area and circle doesn't then it will automatically search in shapes (hierarchy) and area inside shapes will be called automatically

        ob2.area(); // calls area in Square

    }
}
