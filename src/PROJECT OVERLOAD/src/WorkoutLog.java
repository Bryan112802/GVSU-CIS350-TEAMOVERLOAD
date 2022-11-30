
import java.util.*;

public class WorkoutLog {
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
        this.sets = Integer.parseInt(tokens[2]);
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






}
