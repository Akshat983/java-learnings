package JavaByKK.OOPS.Generics;

import java.util.*;

public class LambdaFunction {
    static void main() {
//        Lambda Function can be applied only on Objects and not on primitive data type

//        ArrayList<Integer> l = new ArrayList<>();
//        for (int i = 0; i < 5; i++) {
//            l.add(i+1);
//        }
//        l.forEach((item) -> System.out.println(2 * item));

        Operation sum = (a, b) -> a+b;
        Operation product = (a, b) -> a*b;
        Operation difference = (a, b) -> a-b;

        LambdaFunction myCalculator = new LambdaFunction();
        System.out.println(myCalculator.operate(5, 3, sum));
        System.out.println(myCalculator.operate(5, 3, product));
        System.out.println(myCalculator.operate(5, 3, difference));
    }
    private int operate(int a, int b, Operation op) {
        return op.operation(a, b);
    }
    interface Operation {
        int operation(int a, int b);
    }
}
