package JavaByKK.MathsForDSA.src;

import java.util.*;
public class BinarySearchSqRoot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        System.out.println(sqRoot(n, p ));
    }

    public static double sqRoot(int num, int p) {
        int start = 0;
        int end = num;
        double root = 0.0;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(mid*mid == num) {
                root = mid;
                return root;
            }
            else if(mid*mid < num && (mid+1)*(mid+1) > num) {
                root = mid;
                break;
            }
            else if(mid*mid < num){
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        int a = 1;
        while(a <= p) {
            double base = 1/Math.pow(10, a);
            int st = 0, e = 9;
            while(st <= e) {
                int mid = st + (e - st) / 2;
                if(((root + base*mid)*(root + base*mid)) == num) {
                    root = root + base*mid;
                    return root;
                }
                else if(((root + base*mid)*(root + base*mid)) < num && ((root + base*(mid+1))*(root + base*(mid+1)) > num)) {
                    root = root + base*mid;
                    break;
                }
                else if(((root + base*mid)*(root + base*mid)) < num) {
                    st = mid + 1;
                }
                else {
                    e = mid - 1;
                }
            }
            a++;
        }


        return root;

    }
}
