package JavaByKK.BigNumberHandling;

import java.math.BigInteger;

public class Main {
    static void main(String[] args) {
        // Primitives
        int a = 33;
        int b = 8;

        //BigInteger - Int and  Long
        BigInteger A = BigInteger.valueOf(23);
        BigInteger B = BigInteger.valueOf(234326434564L);

        //Strings
        BigInteger C = new BigInteger("54673324656457");

        //Constants
        BigInteger D = BigInteger.TEN;

        //SUM
//        BigInteger S = A.add(B);
        BigInteger S = B.add(C);

        //Other Operations
        BigInteger mul = B.multiply(C);
        BigInteger sub = B.subtract(C);
        BigInteger div = B.divide(A);
        BigInteger rem = B.remainder(A);
        BigInteger pow = C.pow(a);

//        System.out.println(pow);
        System.out.println(Factorial.fact(431));
    }
}
