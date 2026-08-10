package JavaByKK;
import java.util.*;
public class TWOdAL {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();

        //initialization
        for (int i = 0; i < 3; i++) {
            list.add(i,new ArrayList<Integer>());
        }

        //adding elements
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(in.nextInt());
            }
        }

        System.out.println(list);
    }
}
