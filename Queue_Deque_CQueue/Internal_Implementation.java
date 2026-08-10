package JavaByKK.Queue_Deque_CQueue;

import java.util.ArrayDeque;
import java.util.Deque;

public class Internal_Implementation {
    static void main() {
        //Queue is just an interface which implements LinkedList so we cannot make object of it...
//        Queue<Integer> q = new LinkedList<>();
//        q.add(12);
//        q.add(13);
//        q.add(14);
//        q.add(15);
//        q.add(16);
//
//        System.out.println(q.peek());
//        System.out.println(q.remove());
//        System.out.println(q.remove());
//        System.out.println(q.remove());
//        System.out.println(q.remove());
//        System.out.println(q.remove());


        Deque<Integer> dq = new ArrayDeque<>();
        dq.add(23);
        dq.addFirst(24);
        dq.addLast(56);
        System.out.println(dq.removeLast());
        System.out.println(dq.getLast());
    }
}
