package datastructures.stack;

public class MyStack {
    int[] myStack;
    int top;
    int capacity;

    //constructor to initialize top
    public MyStack(int capacity) {
        myStack = new int[capacity];
        this.capacity = capacity;
        top = -1;
    }

    public boolean isEmpty() {
        if (top < 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean push(int x) {
        if (top >= capacity - 1) {   //top = 19 , capacity - 1 = 19;
            System.out.println("stack overflow");
            return false;
        } else {
            top = top + 1;  // top = 19 + 1 = 20
            myStack[top] = x; //
            return true;
        }
    }

    public int peek() {
        if (top < 0) {
            System.out.println("stack underflow");
            return 0;
        } else {
            int x = myStack[top];
            return x;
        }
    }

    public int pop() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int x = myStack[top];
            top = top - 1;
            return x;
        }
    }

    void traverse() {
        for (int i = 0; i <= top; i++) {
            System.out.println(myStack[i]);
        }
    }

    public int size() {
        return top + 1;
    }
}



