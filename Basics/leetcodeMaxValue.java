package JavaByKK;
import java.util.*;
public class leetcodeMaxValue {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter number of points : ");
        int n=in.nextInt();
        System.out.println("Enter points");
        int[][] arr=new int[n][2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j]=in.nextInt();
            }
        }
        System.out.println("Enter k");
        int k=in.nextInt();
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(Math.abs(arr[i][0]-arr[j][0])<=k && max<(Math.abs(arr[i][0]-arr[j][0])+arr[i][1]+arr[j][1]))
                    max=(Math.abs(arr[i][0]-arr[j][0])+arr[i][1]+arr[j][1]);
            }
        }
        System.out.println(max);
    }
}
