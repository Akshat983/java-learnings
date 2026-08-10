package JavaByKK.linkedList;

public class DLL {
    private Node head;

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head != null) {
            head.prev = node;
        }
        head = node;
    }

    public void insertLast(int val) {
        Node node = new Node(val);
        Node last = head;
        node.next = null;
        if(head == null) {
            head = node;
            node.prev = null;
            return;
        }
        while(last.next != null) {
            last = last.next;
        }
        last.next = node;
        node.prev = last;
    }

    public void insert(int after, int val) {
        Node previous = head;
        Node node = new Node(val);
        while(previous.value != after) {
            previous = previous.next;
        }
        node.next = previous.next;
        if (previous.next != null) {
            previous.next.prev = node;
        }
        previous.next = node;
        node.prev = previous;
    }

    public void display() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.value + " <=> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void displayReverse() {
        Node last = head;
        while(last.next != null) {
            last = last.next;
        }
        while(last != null) {
            System.out.print(last.value + " <=> ");
            last = last.prev;
        }
        System.out.println("START");
    }





    private class Node {
        int value;
        Node next;
        Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}
