package javaHowTo;

public class SortAnArray {

    public static void printArray(String cars[]) {
        for (int i = 0; i < cars.length; i++) {
            System.out.print(cars[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String [] cars = {"Ford", "AMustang", "Lamborghini"};
        for (int i = 0; i < cars.length; i++) {
            for(int j = 0; j < cars.length-i-1; j++){
                if (cars[j].compareTo(cars[j+1])>0){
                    String temp = cars[j];
                    cars[j] = cars[j+1];
                    cars[j+1] = temp;
                }
            }
        }
        printArray(cars);
    }
    }

