package JavaByKK.Queue_Deque_CQueue;

public class CustomQueue {
    protected int[] queue;
    private static int DEFAULT_SIZE = 10;
    private int end = 0;

    CustomQueue(int size) {
        this.queue = new int[size];
    }

    CustomQueue() {
        this(DEFAULT_SIZE);
    }

    public boolean add (int item) {
        if (isFull()) {
            System.out.println("Queue is full!!");
            return false;
        }
        queue[end++] = item;
        return true;
    }

    public int remove () throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty!");
        }

        int removed = queue[0];

        for (int i = 1; i < end ; i++) {
            queue[i-1] = queue[i];
        }
        end--;

        return removed;
    }

    public int front () throws Exception{
        if (isEmpty()) {
            throw new Exception("Queue is empty!");
        }

        return queue[0];
    }

    private boolean isFull () {
        return end == queue.length;
    }

    public boolean isEmpty () {
        return end == 0;
    }
}
