package datastructures.stack;

public class StringStack {
    String[] myStack;
    int top;
    int capacity;

    public StringStack(int capacity){
        myStack = new String[capacity];
        this.capacity = capacity;
        top = -1;
    }

    public boolean isEmpty(){
        if (top < 0){
            return true;
        }else{
            return false;
        }
    }

    public boolean push(String x){
        if (top >= capacity - 1){
            System.out.println("Stack overflow");
            return false;
        } else {
            top = top + 1;
            myStack[top] = x;
            return true;
        }
    }

    public String peek(){
        if ( top < 0){
            System.out.println("Stack underflow");
            return "";
        }else{
            String x = myStack[top];
            return x;
        }
    }

    public String pop(){
        if (top < 0){
            System.out.println("Stack underflow");
            return "";
        }else {
            String x = myStack[top];
            return x;
        }
    }
}
