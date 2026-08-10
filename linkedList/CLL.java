package JavaByKK.linkedList;

public class CLL {
    private Node head;
    private Node tail;

    public CLL() {
        this.head = null;
        this.tail = null;
    }

    public void insert(int val) {
        Node node = new Node(val);
        if(head == null) {
            head = node;
            tail = head;
            tail.next = head;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void display() {
        Node node = head;
        if(head != null) {
            do {
                System.out.print(node.val + " -> ");
                node = node.next;
            } while(node != head);
            System.out.println("HEAD");
        }
    }

    public void delete(int value) {
        Node node = head;
        if(node == null) return;
        if(node.val == value) {
            if(head == tail) {
                head = null;
                tail = null;
                return;
            }
            head = head.next;
            tail.next = head;
            return;
        }
        do {
            Node n = node.next;
            if(n.val == value) {
                node.next = n.next;
                if(tail == n) {
                    tail = node;
                }
                tail.next = head;
                break;
            }
            node = node.next;
        } while (node != head);
    }

    private class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

}
