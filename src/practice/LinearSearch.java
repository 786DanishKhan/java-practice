package practice;
//Done
public class LinearSearch {
    public static void main(String[] args) {
        int [] number = {10, 30, 40, 50, 60};
        int givenNumber = 40;

        for (int i = 0; i< number.length; i++){
            if(givenNumber==number[i]){
                System.out.println("Number exist in array at index:" +i);
                break;
            }/*else{
                System.out.println("Number not exist in array");
            }*/
        }
    }
}
