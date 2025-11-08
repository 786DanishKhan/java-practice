package LeetCode;

public class MiddleLinkedList {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        Solution876 sol = new Solution876();
        Node middle = sol.middleLinkedList(head);
        System.out.println(middle);
        sol.traverse(middle);
    }
}

class Solution876 {
    public Node middleLinkedList(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public void traverse(Node head) {
        Node curr = head;
        while(curr!=null){
            System.out.println(curr.data);
            curr = curr.next;
        }
    }
}
