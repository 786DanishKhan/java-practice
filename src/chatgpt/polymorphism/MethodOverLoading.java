package chatgpt.polymorphism;

public class MethodOverLoading {
    public static void main(String[] args) {
MethodOverLoad obj = new MethodOverLoad();
        System.out.println(obj.add(23,5));
        System.out.println(obj.add(3,5,8));
        System.out.println(obj.add(2.5,6.5));
    }
}

class MethodOverLoad{
 int add (int a, int b){
     return a+b;
 }
 int add (int a, int b, int c){
     return a+b+c;
 }
 double add (double a, double b){
     return a+b;
 }
}
