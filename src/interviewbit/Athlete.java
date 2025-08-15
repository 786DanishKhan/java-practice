package interviewbit;

public class Athlete {
    public String name;//instance variable
    public double speed = 200;//instance variable
    public int age;//instance variable
    public void localMethod(){
        String skr1 = "Method";//local variable
    }

    public static void main(String[] args) {
        Athlete athlete = new Athlete();
        //athlete.name;
        String abc = "local";//local variable
        System.out.println(abc);
        System.out.println();
        athlete.athleteRun(athlete.speed);
        athlete.localMethod();

    }
    public void athleteRun(double s){
        int speed = 100;//Local variable
        System.out.println("Athlete Runs at" +s + "km/hr");
        System.out.println("Athlete Runs at" +speed + "km/hr");
    }
}
