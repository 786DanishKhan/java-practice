package interviewbit;

public class ConstructorOverloading {
    public static void main(String[] args) {
        Hospital obj = new Hospital(10,20);
        Hospital obj1 = new Hospital(10);
        Hospital obj2 = new Hospital(2.2);
        System.out.println(obj1.variable1);
        System.out.println(obj.variable1+" " +obj.variable2);
        System.out.println(obj2.variable3);
    }

}
class Hospital{
    int variable1;
    int variable2;
    double variable3;

    public Hospital(int a,int b){
        variable1 = a;
        variable2 = b;
    }
    public Hospital(double c){
        variable3 = c;
    }
    public Hospital(int d){
        variable1 = d;
    }
}
