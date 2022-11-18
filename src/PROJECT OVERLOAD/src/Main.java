

import java.io.*;
import java.util.Scanner;


public class Main extends LogHistory{
    public static void main(String[] args) throws IOException {
        Scanner scnr = new Scanner(System.in);

        initializeArray();

        System.out.println("OVERLOAD");
        System.out.println("Select a task: ");
        System.out.println("    1) New Log");
        System.out.println("    2) Workout History");
        System.out.println("    0) Exit");
        int initSelection = scnr.nextInt();
        do {
            if (initSelection == 1) {
                System.out.println("Select your exercise: ");
                System.out.println("    1) Squat");
                System.out.println("    2) Bench Press");
                System.out.println("    3) Deadlift");
                System.out.println("    4) Snatch");
                System.out.println("    5) Clean and Jerk");

                int exerciseSelection = 0;
                exerciseSelection = scnr.nextInt();
                String exercise = "";

                if(exerciseSelection == 1) {
                    exercise = "Squat";
                }
                else if(exerciseSelection == 2) {
                    exercise = "Bench Press";
                }
                else if(exerciseSelection == 3) {
                    exercise = "Deadlift";
                }
                else if(exerciseSelection == 4) {
                    exercise = "Snatch";
                }
                else if(exerciseSelection == 5) {
                    exercise = "Clean and Jerk";
                }


                String dateSelection = "";
                int setSelection = 0;
                String weightrepSelection = "";
                String data;

                if (exerciseSelection == 1) {
                    System.out.println("You have selected squat!");
                    System.out.println("Enter date.");
                    dateSelection = scnr.next();
                    System.out.println("Enter number of sets.");
                    setSelection = scnr.nextInt();
                    for(int i = 0; i < setSelection; i++) {
                        System.out.println("Enter weight(lbs)/reps.");
                        String wrTemp;
                        wrTemp = scnr.next();
                        weightrepSelection +=  wrTemp + " ";
                    }
                    data = dateSelection + "," + exercise + ","
                            + String.valueOf(setSelection) + "," + weightrepSelection;
                    WorkoutLog newLog = new WorkoutLog(data);
                    history.add(newLog);


                    FileWriter fWriter = new FileWriter(file, true);
                    BufferedWriter bWriter = new BufferedWriter(fWriter);
                    bWriter.write(data + "\n");
                    bWriter.close();

                }
                else if (exerciseSelection == 2) {

                    System.out.println("You have selected bench press!");
                    System.out.println("Enter date.");
                    dateSelection = scnr.next();
                    System.out.println("Enter number of sets.");
                    setSelection = scnr.nextInt();
                    for(int i = 0; i < setSelection; i++) {
                        System.out.println("Enter weight(lbs)/reps.");
                        String wrTemp;
                        wrTemp = scnr.next();
                        weightrepSelection +=  wrTemp + " ";
                    }
                    data = dateSelection + "," + exercise + ","
                            + String.valueOf(setSelection) + "," + weightrepSelection;
                    WorkoutLog newLog = new WorkoutLog(data);
                    history.add(newLog);


                    FileWriter fWriter = new FileWriter(file, true);
                    BufferedWriter bWriter = new BufferedWriter(fWriter);
                    bWriter.write(data + "\n");
                    bWriter.close();

                }
                else if (exerciseSelection == 3) {

                    System.out.println("You have selected deadlift!");
                    System.out.println("Enter date.");
                    dateSelection = scnr.next();
                    System.out.println("Enter number of sets.");
                    setSelection = scnr.nextInt();
                    for(int i = 0; i < setSelection; i++) {
                        System.out.println("Enter weight(lbs)/reps.");
                        String wrTemp;
                        wrTemp = scnr.next();
                        weightrepSelection +=  wrTemp + " ";
                    }
                    data = dateSelection + "," + exercise + ","
                            + String.valueOf(setSelection) + "," + weightrepSelection;
                    WorkoutLog newLog = new WorkoutLog(data);
                    history.add(newLog);


                    FileWriter fWriter = new FileWriter(file, true);
                    BufferedWriter bWriter = new BufferedWriter(fWriter);
                    bWriter.write(data + "\n");
                    bWriter.close();

                }
                else if (exerciseSelection == 4) {

                    System.out.println("You have selected snatch!");
                    System.out.println("Enter date.");
                    dateSelection = scnr.next();
                    System.out.println("Enter number of sets.");
                    setSelection = scnr.nextInt();
                    for(int i = 0; i < setSelection; i++) {
                        System.out.println("Enter weight(lbs)/reps.");
                        String wrTemp;
                        wrTemp = scnr.next();
                        weightrepSelection +=  wrTemp + " ";
                    }
                    data = dateSelection + "," + exercise + ","
                            + String.valueOf(setSelection) + "," + weightrepSelection;
                    WorkoutLog newLog = new WorkoutLog(data);
                    history.add(newLog);

                    FileWriter fWriter = new FileWriter(file, true);
                    BufferedWriter bWriter = new BufferedWriter(fWriter);
                    bWriter.write(data + "\n");
                    bWriter.close();

                }
                else if (exerciseSelection == 5) {

                    System.out.println("You have selected clean and jerk!");
                    System.out.println("Enter date.");
                    dateSelection = scnr.next();
                    System.out.println("Enter number of sets.");
                    setSelection = scnr.nextInt();
                    for(int i = 0; i < setSelection; i++) {
                        System.out.println("Enter weight(lbs)/reps.");
                        String wrTemp;
                        wrTemp = scnr.next();
                        weightrepSelection +=  wrTemp + " ";
                    }
                    data = dateSelection + "," + exercise + ","
                            + String.valueOf(setSelection) + "," + weightrepSelection;
                    WorkoutLog newLog = new WorkoutLog(data);
                    history.add(newLog);

                    FileWriter fWriter = new FileWriter(file, true);
                    BufferedWriter bWriter = new BufferedWriter(fWriter);
                    bWriter.write(data + "\n");
                    bWriter.close();

                }
                else {
                    //make this throw exception
                    System.out.println("Invalid Response");
                }


            }
        }
        while (initSelection != 0);


    }

}
