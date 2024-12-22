package w3schools;
import java.util.HashSet;

public class HashSetForLoop {
    public static void main(String[] args) {
        HashSet<Integer> number = new HashSet<Integer>();
        number.add(1);
        number.add(2);
        number.add(3);
        number.add(4);

        for (int i = 0; i <=10; i++){
            if(number.contains(i)){
                System.out.println(i +" was found in tha set");
            }else{
                System.out.println(i + " was not found in tha set");
            }
        }
    }
}
