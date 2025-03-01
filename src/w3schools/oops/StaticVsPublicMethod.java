package w3schools.oops;

public class StaticVsPublicMethod {
    static void myStatic(){
        System.out.println("Static");
    }
    public void myPublic(){
        System.out.println("Public");
    }

    public static void main(String[] args) {
        myStatic();
        StaticVsPublicMethod obj = new StaticVsPublicMethod();
        obj.myPublic();
    }
}
