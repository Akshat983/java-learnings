package JavaByKK.linkedList;

public class LL {
    private Node head;
    private Node tail;
    private int size;

    public LL() {
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

    public void insertRec(int val, int index) {
        head = insertRec(val, index, head);
    }

    private Node insertRec(int val, int index, Node node) {
        if(index == 0) {
            Node temp = new Node(val, node);
            return temp;
        }
        node.next = insertRec(val, index - 1, node.next);
        return node;
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

    //REVERSAL OF A LINKED-LIST
    public void reverse(Node node) {
        if(node == tail) {
            head = tail;
            return;
        }
        reverse(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;
    }

    //IN-PLACE REVERSAL OF A LINKED-LIST
    public void inPlaceReverse() {
        if (size < 2) return;
        Node curr = head;
        Node prev = null;
        Node next = head.next;
        while(curr != null) {
            curr.next = prev;
            prev = curr;
            curr = next;
            if(curr.next != null) next = curr.next;
        }
        head = curr;
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