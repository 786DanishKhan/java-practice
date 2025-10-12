package datastructures.linkedlist;

public class Node2 {
    int data;
    Node2 next;

    Node2(int data){
        this.data = data;
        this.next = null;
    }

    public static Node2 insertAtEnd (Node2 head, int data){

            Node2 N = new Node2(data);

            if ( head == null){
                return N;
            }

            Node2 current = head;

            while (current.next!=null){
                current = current.next;
            }
            current.next = N;

            return head;
        }
}

class solution1{
    public static void main(String[] args) {
        Node2 head = null;
        head = Node2.insertAtEnd(head, 2);
        head = Node2.insertAtEnd(head, 3);
        head = Node2.insertAtEnd(head, 4);
        head = Node2.insertAtEnd(head, 1);

        // Print the linked list
        Node2 current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}


