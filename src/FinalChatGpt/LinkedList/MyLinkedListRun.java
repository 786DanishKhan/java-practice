package FinalChatGpt.LinkedList;

public class MyLinkedListRun {
    public static void main(String[] args) {
        MyLinkedList obj = new MyLinkedList();
        int length = obj.length(null);
        System.out.println(length);
        boolean search = obj.search(null,1);
        System.out.println(search);
        Node node1 = obj.insertAtEnd(null,12);
        obj.traverse(node1);
        Node node2 = obj.insertAtEnd(node1,15);
        obj.traverse(node2);
        obj.deleteAtEnd(node2);

        }
}
