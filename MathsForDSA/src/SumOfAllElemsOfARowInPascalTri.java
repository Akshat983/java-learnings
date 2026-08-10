public class SumOfAllElemsOfARowInPascalTri {
    public static void main(String[] args) {
        /*
        Pascal's Triangle :
              1
            1 2 1
           1 3 3 1
          1 4 6 4 1

        here nth row has elems : nC0, nC1, ....., nCn
        which has sum pow(2, n)
         */
        int n = 4;
        System.out.println((int) Math.pow(2, n));
    }
}
