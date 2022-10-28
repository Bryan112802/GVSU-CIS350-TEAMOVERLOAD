
import java.util.*;

public class WorkoutLog {

    private ArrayList<String> workouts;

    private String workout = "";

    private String date = "";

    private String sets = "";


    public void workouts() { // workout options array
        workouts =  new ArrayList<String>();
        workouts.add("Squat");
        workouts.add("Bench Press");
        workouts.add("Deadlift");
        workouts.add("Snatch");
        workouts.add("Clean and Jerk");
    }

    public WorkoutLog() { // class instantiated
        workouts();
    }

    public void addWorkout(int workout) {
        this.workout = workouts.get(workout - 1);
    }

    public void addDate(String date) {
        this.date = date;
    }






}
