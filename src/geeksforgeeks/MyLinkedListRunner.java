package geeksforgeeks;

public class MyLinkedListRunner {
    public static void main(String[] args) {
        MyLinkedList obj = new MyLinkedList();
        Node node =  obj.insertAtEnd(null,1);
        obj.traverse(node);
        Node node1 =  obj.insertAtEnd(node,2);
        obj.traverse(node1);
        Node node2 = obj.insertAtEnd(node1,3);
        obj.traverse(node2);
        Node node3 = obj.insertAtEnd(node2,4);
        obj.traverse(node3);
        Node node4 = obj.insertAtEnd(node3,5);
        obj.traverse(node4);
        Node node5 = obj.insertAtEnd(node4,6);
        obj.traverse(node5);
    }
}
