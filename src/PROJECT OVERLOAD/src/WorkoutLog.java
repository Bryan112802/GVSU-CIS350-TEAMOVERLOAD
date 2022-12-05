
import java.util.*;

import static java.lang.Integer.parseInt;


public class WorkoutLog {
    /*public int compareTo(WorkoutLog o) {
        String delim = "/";
        String[]tokens = (this.date.split(delim));
        int month = parseInt(tokens[0]);
        int day = parseInt(tokens[1]);
        int year = parseInt(tokens[2]);

        String[]tokens2 = ((o.getDate()).split(delim));
        int month2 = parseInt(tokens[0]);
        int day2 = parseInt(tokens[1]);
        int year2 = parseInt(tokens[2]);

        if(tokens == tokens2) {
            return 0;
        }

        if (year < year2) {
            return -1;
        }
        else if (month < month2) {
            return -1;
        }
        else if (day < day2) {
            return -1;
        }
        else {
            return 1;
        }


    } */

    public WorkoutLog() {

    }

    private ArrayList<String> workouts;

    private String workout = "";

    private String date = "";

    private int sets = 0;

    private String repWeight = "";



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
