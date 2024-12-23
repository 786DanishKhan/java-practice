package datastructures.linkedlist;

public class StringLinkedList {
    public void traverse(Node1 head){
        Node1 current = head;

        while(current!=null){
            System.out.print(current.data+ " ");

            current = current.next;
        }
        System.out.println();
    }

        public boolean search(Node1 head,String target){
        while(head!=null){

            if (head.data == target){
                return true;
            }
            head = head.next;
        }
        return false;
    }

    public int length (Node1 head){

        int length = 0;

        Node1 current = head;

        while(current!=null){

            length++;

            current = current.next;
        }
        return length;
    }

    public Node1 insertAtEnd (Node1 head, String value){

        Node1 newNode = new Node1(value);

        if ( head == null){
            return newNode;
        }

        Node1 current = head;

        while (current.next!=null){
            current = current.next;
        }
        current.next = newNode;

        return head;
    }

    public Node1 deleteLastNode (Node1 head) {

        if(head == null){
            return null;
        }

        if(head.next==null){
            head = null;
            return null;
        }

        Node1 secondLast = head;

        while (secondLast.next.next!=null){
            secondLast = secondLast.next;
        }

        secondLast.next = null;

        return head;
    }

}
