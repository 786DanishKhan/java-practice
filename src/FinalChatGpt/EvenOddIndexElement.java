package FinalChatGpt;

public class EvenOddIndexElement {
    public static void main(String[] args) {
        String[] elements = {"Java", "Selenium", "TestNG", "Maven", "Jenkins", "Docker"};

        System.out.println("Elements at even index:");
        for (int i = 0; i < elements.length; i += 2) {
            System.out.println(elements[i] + " ");
}
            System.out.println("Elements at odd index:");
            for (int j = 1; j < elements.length; j += 2) {
                System.out.println(elements[j] + " ");
            }
        }
    }
