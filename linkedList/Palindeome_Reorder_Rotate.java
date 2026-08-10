package JavaByKK.linkedList;

public class Palindeome_Reorder_Rotate {

//    https://leetcode.com/problems/reorder-list/
    public void reorderList(ListNode head) {
        if(head == null || head.next == null) return;

        ListNode mid = mid(head);
        ListNode hf = head;
        ListNode hs = reverse(mid);

        while(hf != null && hs != null) {
            ListNode temp = hf.next;
            hf.next = hs;
            hf = temp;
            temp = hs.next;
            hs.next = hf;
            hs = temp;
        }
        if(hf != null) hf.next = null;
    }


    public boolean isPalindrome(ListNode head) {
        ListNode mid = mid(head);
        ListNode h = reverse(mid);
        while(head != null && h != null) {
            if(head.val != h.val) return false;
            head = head.next;
            h = h.next;
        }
        return true;
    }
    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = curr.next;
        while(curr != null) {
            curr.next = prev;
            prev = curr;
            curr = next;
            if(next != null) next = next.next;
        }
        return prev;
    }

//    https://leetcode.com/problems/rotate-list/
    public ListNode rotateRight(ListNode head, int k) {
        if (k == 0 || head == null || head.next == null) return head;
        int s = 0;
        ListNode t = head;
        ListNode last = null;
        while (t != null) {
            s++;
            if (t.next == null) last = t;
            t = t.next;
        }
        k = (k % s);
        if (k == 0) return head;
        t = head;
        ListNode newHeadPrev = null;
        for (int c = 0; c < s-k; c++) {
            newHeadPrev = t;
            t = t.next;
        }
        ListNode newHead = t;
        newHeadPrev.next = null;
        last.next = head;
        return newHead;
    }

    public ListNode mid(ListNode head) {
        ListNode sp = head;
        ListNode fp = head;
        while(fp != null && fp.next != null) {
            sp = sp.next;
            fp = fp.next.next;
        }
        return sp;
    }

//    https://leetcode.com/problems/reverse-nodes-in-k-group/
    public ListNode reverseKGroup(ListNode head, int k) {
        if(k <= 0 || head == null || head.next == null) return head;

        while (true) {
            ListNode prev = null;
            ListNode curr = head;
            ListNode next = curr.next;
            ListNode last = prev;
            ListNode newEnd = curr;
            for(int i = 0; curr != null && i < k; i++) {
                curr.next = prev;
                prev = curr;
                curr = next;
                if(next != null) next = curr.next;
            }
            if(last != null) {
                last.next = prev;
            }
            else {
                head = prev;
            }
            newEnd.next = curr;
            return head;
        }
    }

//    https://leetcode.com/problems/reverse-linked-list-ii/
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left == right) return head;
        ListNode prev = null;
        ListNode curr = head;
        for(int i = 0; curr != null && i < left-1; i++) {
            prev = curr;
            curr = curr.next;
        }
        ListNode next = curr.next;
        ListNode last = prev;
        ListNode newEnd = curr;
        for(int i = 0; curr != null && i < right - left +1; i++) {
            curr.next = prev;
            prev = curr;
            curr = next;
            if(next != null) next = curr.next;
        }
        if(last != null) {
            last.next = prev;
        }
        else {
            head = prev;
        }
        newEnd.next = curr;
        return head;
    }

    private class ListNode {
        int val;
        ListNode next;

        ListNode(int value) {
            this.val = value;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
