public class LinearSearch {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        int givenNumber = 60;

        for (int i = 0; i < numbers.length; i++) {
            if (givenNumber == numbers[i]) {
                System.out.println("number exists in array at index:" +i);
                break;
            }
        }
    }
}