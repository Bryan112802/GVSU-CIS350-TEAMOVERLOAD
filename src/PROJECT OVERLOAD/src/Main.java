import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Select your exercise: ");
        System.out.println("    1) Squat");
        System.out.println("    2) Bench Press");
        System.out.println("    3) Deadlift");
        System.out.println("    4) Snatch");
        System.out.println("    5) Clean and Jerk");

        int exerciseSelection = 0;
        exerciseSelection = scnr.nextInt();

        if (exerciseSelection == 1) {

        }
        else if (exerciseSelection == 2) {

        }
        else if (exerciseSelection == 3) {

        }
        else if (exerciseSelection == 4) {

        }
        else if (exerciseSelection == 5) {

        }
        else {
            //make this throw exception
            System.out.println("Invalid Response");
        }

    }
}