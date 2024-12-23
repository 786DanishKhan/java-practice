package datastructures.linkedlist;

public class StringLinkedListRunner {
    public static void main(String[] args) {
        StringLinkedList obj = new StringLinkedList();
        int length = obj.length(null);
        System.out.println(length);
        obj.traverse(null);
        Node1 head = obj.insertAtEnd(null,"danish");
        obj.traverse(head);
        Node1 head1 = obj.insertAtEnd(head,"bushra");
        obj.traverse(head1);
        Node1 head2 = obj.insertAtEnd(head1,"afreen");
        obj.traverse(head2);
        Node1 head3 = obj.insertAtEnd(head2,"heena");
        obj.traverse(head3);
        obj.deleteLastNode(head3);
        obj.traverse(head3);
    }
}
