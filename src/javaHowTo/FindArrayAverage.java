package javaHowTo;
//Done
public class FindArrayAverage {
    public static void main(String[] args) {
        int [] number = {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;
        int avg = 0;

        for(int i=0;i<number.length;i++){
            sum = sum + number[i];
        }

        avg = sum/number.length;
        System.out.println("The average of array is: " + avg);
    }
}
