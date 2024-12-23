package datastructures.linkedlist;

public class MyLinkedListRunner {
    public static void main(String[] args) {
        MyLinkedList obj = new MyLinkedList();
        int length = obj.length(null);
        System.out.println(length);
        obj.traverse(null);
        boolean search = obj.search(null, 1);
        System.out.println(search);
        Node node1 = obj.insertAtEnd(null, 12);
        obj.traverse(node1);
        Node node2 = obj.insertAtEnd(node1, 5);
        obj.traverse(node2);
        Node node3 = obj.insertAtEnd(node2, 15);
        obj.traverse(node3);
        obj.deleteLastNode(null);
        Node node4 = obj.insertAtEnd(node3, 8);
        obj.traverse(node4);
        Node node5 = obj.insertAtEnd(node4, 8);
        obj.traverse(node5);
    }
}
