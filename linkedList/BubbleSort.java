package JavaByKK.linkedList;

public class BubbleSort {
    private Node head;
    private Node tail;
    private int size;

    public BubbleSort() {
        size = 0;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null) {
            tail = head;
        }

        size += 1;
    }

    public void insertLast(int val) {
        if(tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size += 1;
    }

    public void insert(int val, int index) {
        if(index == 0) {
            insertFirst(val);
            return;
        }
        if(index == size) {
            insertLast(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(val);
        node.next = temp.next;
        temp.next = node;
        size++;
    }



    public int deleteFirst() {
        int value = head.value;
        head = head.next;
        if(head == null) tail = null;
        size--;
        return value;
    }

    public Node get(int index) {
        Node temp = head;
        for (int i = 1; i <= index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public int deleteLast() {
        if(size <= 1) {
            return deleteFirst();
        }
        Node node = this.get(size-2);
        int val = tail.value;
        node.next = null;
        tail = node;
        size--;
        return val;
    }

    public int delete(int index) {
        if(index == 0) return deleteFirst();
        if(index == size-1) return deleteLast();
        Node prev = this.get(index - 1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        size--;
        return val;
    }

    public void display() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void bubbleSort() {
        bubbleSort(size - 1, 0);
    }

    private void bubbleSort(int r, int c) {
        if(r == 0) return;

        if(c < r) {
            Node f = get(c);
            Node s = get(c+1);

            if(f.value > s.value) {
                //swap
                if(f == head) {
                    head = s;
                    f.next = s.next;
                    s.next = f;
                } else if (s == tail) {
                    Node prev = get(c-1);
                    prev.next = s;
                    s.next = f;
                    f.next = null;
                    tail = f;
                } else {
                    Node prev = get(c-1);
                    prev.next = s;
                    f.next = s.next;
                    s.next = f;
                }
            }
            bubbleSort(r, c+1);
        }
        else bubbleSort(r-1, 0);
    }

    private class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}