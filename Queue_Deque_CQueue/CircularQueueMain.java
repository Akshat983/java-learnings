package JavaByKK.Queue_Deque_CQueue;

public class CircularQueueMain {
    static void main() throws Exception {
        CircularQueue q = new CircularQueue(5);

        q.insert(12);
        q.insert(13);
        q.insert(14);
        q.insert(15);
        q.insert(16);

        System.out.println(q.front());
        q.display();
        q.remove();
        q.display();
        q.insert(23);
        q.display();
    }
}
