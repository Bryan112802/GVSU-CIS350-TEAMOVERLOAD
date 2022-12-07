
import java.util.*;

import static java.lang.Integer.parseInt;


public class WorkoutLog {

    private ArrayList<String> workouts;

    private String workout = "";

    private String date = "";

    private int sets = 0;

    private String repWeight = "";

    private static final int[] MONTH_DAYS = {31, 28, 31, 30, 31, 30, 31, 31,
            30, 31, 30, 31};

    private static boolean isLeapYear(int year) {
        if(year % 4 != 0) {
            return false;
        }
        else if(year % 400 == 0) {
            return true;
        }
        //checks to make sure not turn of century
        else if(year % 100 == 0) {
            return false;
        }
        else {
            return true;
        }
    }

    public static boolean isValidDate(String dateCheck) {
        String delim = "/";
        String[]tokens = (dateCheck.split(delim));
        int month = parseInt(tokens[0]);
        int day = parseInt(tokens[1]);
        int year = parseInt(tokens[2]);

        if(tokens.length != 3) {
            return false;
        }
        else if (!isLeapYear(year) && month == 2 && day > 28
                || isLeapYear(year) && month == 2 && day > 29) {
            return false;
        }
        else if (month > 12 || month < 1) {
            return false;
        }
        else if (day > 31 || day < 1) {
            return false;
        }
        else if (year < 0) {
            return false;
        }
        else if (!isLeapYear(year) && day > MONTH_DAYS[month - 1]) {
            return false;
        }
        else {
            return true;
        }

    }

    public WorkoutLog() {

    }

    public WorkoutLog(String data) { // class instantiated
        String deliminator = "[,]";
        String[] tokens = data.split(deliminator);
        this.date = tokens[0];
        this.workout = tokens[1];
        this.sets = parseInt(tokens[2]);
        this.repWeight = tokens[3];
    }

    public ArrayList<String> getWorkouts() {
        return workouts;
    }

    public void setWorkouts(ArrayList<String> workouts) {
        this.workouts = workouts;
    }

    public String getWorkout() {
        return workout;
    }

    public void setWorkout(String workout) {
        this.workout = workout;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getSets() {
        return sets;
    }

    public void setSets(int sets) {
        this.sets = sets;
    }

    public String getRepWeight() {
        return repWeight;
    }

    public void setRepWeight(String repWeight) {
        this.repWeight = repWeight;
    }

    public void addWorkout(int workout) {
        this.workout = workouts.get(workout - 1);
    }

    public void addDate(String date) {
        this.date = date;
    }

    public String toString() {
        String delim = " ";
        String[]tokens = repWeight.split(delim);
        String repWeight = "";
        int repTr2 = 0;
        for (int i = 0; i < getSets(); i++){
            repWeight += "Set " + (i+1) + ": " + tokens[repTr2] + " lbs for " + tokens[repTr2+1] + " reps" + "\n";
            repTr2 += 2;
        }
        return "Date: " + this.getDate() + "\n" + "Exercise: " + this.getWorkout() + "\n" + repWeight;
    }

}
