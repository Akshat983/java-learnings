package JavaByKK;
import java.util.*;
public class TwoD {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

//        int[][] arr={
//                {1, 3, 4, 1},
//                {1, 6, 7},
//                {8}
//        };
//        for(int i=0;i<3;i++){
//        System.out.println(Arrays.toString(arr[i]));}


        //input :
        int n=in.nextInt();
        int[][] arr=new int[n][];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=new int[n];
        }
        for (int[] a : arr) {
            System.out.println(Arrays.toString(a));
        }
    }
}
