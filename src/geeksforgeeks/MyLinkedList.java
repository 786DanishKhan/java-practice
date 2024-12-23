package geeksforgeeks;

public class MyLinkedList {

    public void traverse(Node head) {

        Node current = head;

        while (current != null) {

            System.out.print(current.data);

            current = current.next;
        }

        System.out.println( );
    }

    public Node insertAtEnd(Node head, int value) {

        Node newNode = new Node(value);

        if (head == null) {
            return newNode;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
        return head;
    }
}
