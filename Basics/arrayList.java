package JavaByKK;
import java.util.*;
public class arrayList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);
//        int n=in.nextInt();

        //                  input :
//        for (int i = 0; i < n; i++) {
//            list.add(in.nextInt());
//        }

        list.add(12);
        list.add(345);
        list.add(536);
        list.add(46);
        list.add(456);

        //                   output :

        System.out.println(list);
        //or : use of        list.get()
//        for (int i = 0; i < n; i++) {
//            System.out.print(list.get(i)+" ");
//        }
        //or : use of     list.toArray()
        System.out.println("\n");
//        System.out.println(Arrays.toString(list.toArray()));

        //      list.set(int index, int value);
        list.set(3,999);
        System.out.println(list);

        //      list.remove(int index);
        list.remove(2);
        System.out.println(list);

//        list.clear();   //clears the entire list
//        System.out.println(list);

//        System.out.println(list.getFirst());
//        System.out.println(list.getLast());

        list.add(3,564);
        System.out.println(list);

//        ArrayList cloned=(ArrayList)list.clone();   //list.clone() : return cloned list as an object
//        System.out.println(cloned);

        System.out.println(list.contains(456)); //boolean return type

        System.out.println(list.size());  //returns the length(size) of the list

//        list.trimToSize();  //trims to the current size of array_list
//        System.out.println(list);


                          //iterator:

//        Iterator<Integer> iter= list.iterator();
//        while(iter.hasNext())
//        {
//            System.out.println(iter.next()+" ");
//        }


    }
}
