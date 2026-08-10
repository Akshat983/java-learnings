package JavaByKK;

import java.util.Scanner;

public class leetcodeSetMatrixZeroes {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int m =in.nextInt();
        int n=in.nextInt();
        int[][] ar=new int[m][n];
        int[][] nar=new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                ar[i][j]=in.nextInt();
                nar[i][j]=ar[i][j];
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(ar[i][j]==0)
                {
                    for (int k = 0; k < n; k++) {
                        nar[i][k]=0;
                    }
                    for (int k = 0; k < m; k++) {
                        nar[k][j]=0;
                    }
                }
            }
        }

        for(int[] a : nar)
        {
            for(int k : a)
            {
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}
