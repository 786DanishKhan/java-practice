package datastructures.stack;

public class StringStackRunner {
    public static void main(String[] args) {
        StringStack obj = new StringStack(10);
        boolean isEmpty = obj.isEmpty();
        System.out.println(isEmpty);

        boolean push = obj.push("Danish");
        System.out.println(push);
        String peek = obj.peek();
        System.out.println(peek);
        obj.push("heena");
        obj.push("Afreen");
        obj.push("bushra");

        System.out.println(obj.peek());

        String pop = obj.pop();
        System.out.println(pop);
    }
}
