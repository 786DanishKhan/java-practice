package datastructures.stack;

public class MyStackRunner {
    public static void main(String[] args) {
        MyStack obj = new MyStack(10);
        boolean isEmpty = obj.isEmpty();
        System.out.println(isEmpty);

        boolean push = obj.push(20);
        System.out.println(push);


        int peek = obj.peek();
        System.out.println(peek);

        obj.push(18);
        obj.push(15);
        obj.push(12);
        obj.push(10);
        System.out.println(obj.peek());

        int pop = obj.pop();
        System.out.println(pop);

        System.out.println(obj.peek());


        System.out.println();

        obj.traverse();
        System.out.println();
    }
}
