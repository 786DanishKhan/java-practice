package geeksforgeeks;

public class PrintLinkedList {
    public void printList (Node head){
        Node current = head;

        while(current!=null){
            System.out.print(current.data+" ");
            current = current.next;
        }
    }
}
