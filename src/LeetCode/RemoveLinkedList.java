package LeetCode;

public class RemoveLinkedList {
    public static void main(String[] args) {
        Solution22 s = new Solution22();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next = new ListNode(6);
        s.traverse(head);
        int val = 6;
        ListNode newHead = s.removeElements(head, val);
        s.traverse(newHead);
    }
}

class Solution22{
    public ListNode removeElements(ListNode head, int val) {
        // Create a dummy node that points to the head
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = dummy;

        while (current.next != null) {
            if (current.next.val == val) {
                // Skip the node with the target value
                current.next = current.next.next;
            } else {
                // Move to the next node
                current = current.next;
            }
        }
        return dummy.next; // Return the new head, which is next of dummy
    }

    public void traverse(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}