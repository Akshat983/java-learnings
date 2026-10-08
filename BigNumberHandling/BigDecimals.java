package JavaByKK.BigNumberHandling;

import java.math.BigDecimal;

public class BigDecimals {
    static void main(String[] args) {
        BD(); // gives incorrect answers sometimes

        //solution is: BigDecimal
        BigDecimal A = new BigDecimal("0.3");
        BigDecimal B = new BigDecimal("0.4");
        BigDecimal ans = A.subtract(B);
        System.out.println(ans);

        //other operations
        System.out.println(A.multiply(B));
        System.out.println(A.add(B));
        System.out.println(A.divide(B));
        System.out.println(A.pow(2));
    }

    //why we need BigDecimal data type?
    static void BD() {
        double a = 0.03;
        double b= 0.04;
        System.out.println(a-b); //here, answer comes to be: -0.010000000000000002 (which is incorrect
/*        this wrong answer comes because float and double are floating point numbers and are stored in memory as
          fractions in binary(fraction part multiplied by 2 and quotient stored as binary) so they leave behind a
          residue generally in 10^-19 so to fix these stuffs BigDecimal was introduced as it gives exact answers    */
    }
}
