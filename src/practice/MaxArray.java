package practice;
//Done
public class MaxArray {
    public static void main(String[] args) {
        int[] number = {50, 55, 6, 0, 65, 99};
        int max = number[0];

        for (int i = 1; i< number.length; i++){
            if(number[i]>max){
                max = number[i];
            }
        }
        System.out.println("Largest array :" +max);
    }
}
