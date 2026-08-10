package JavaByKK.OOPS.collections;

import java.util.ArrayList;
import java.util.*;

public class Main {
    static void main() {
        // COLLECTIONS HAS MANY FUNCTIONS IN COMMON WITH LIST SO LIST EXTENDS COLLECTIONS CLASS
        // LIST IS ALSO A PARENT CLASS OF MANY LIKE ARRAYLIST, LINKEDLIST, VECTOR, BECOZ IT HAS MANY COMMON FUNCTIONS
        List<Integer> arraylist = new ArrayList<>();
        List<Integer> linkedlist = new LinkedList<>();

        arraylist.add(12);
        arraylist.add(23);
        arraylist.add(45);

        linkedlist.add(22);
        linkedlist.add(3);
        linkedlist.add(223);

        System.out.println(arraylist);
        System.out.println(linkedlist);

        //Vector is slow but it is SYNCHRONIZED (ArrayList is not synchronized so when multiple threads work simultaneously bugs might come)
        List<Integer> vector = new Vector<>();
        vector.add(11);
        vector.add(32);
        vector.add(54);

        System.out.println(vector);
    }
}
