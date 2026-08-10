package JavaByKK.Queue_Deque_CQueue;

public class CustomQueueMain {
    static void main() throws Exception {
        CustomQueue q = new CustomQueue(5);

        q.add(12);
        q.add(13);
        q.add(14);
        q.add(15);
        q.add(16);

        System.out.println(q.front());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
    }
}
