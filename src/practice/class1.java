package practice;

public class class1 {
    void add(int p, int q) {
        System.out.println(p + q);
    }
}
    class class2 extends class1{
        void mul (int p , int q){
            System.out.println(p*q);
        }

        void task (int p , int q){
            System.out.println(p*p+q*q);
        }
    }

    class test{
    public static void main(String[] args) {
        class2 c1 = new class2();
        int a = 5;
        int b = 2;
        c1.add(a, b);
        c1.mul(a, b);
        c1.task(a, b);
    }
    }

