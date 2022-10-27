import java.util.*;

public class WorkoutLog {

    private ArrayList<String> workouts;

    private String date;

    private String sets;


    public void workouts() { // workout options array
        workouts =  new ArrayList<>();
        workouts.add("Squat");
        workouts.add("Bench Press");
        workouts.add("Deadlift");
        workouts.add("Snatch");
        workouts.add("Clean and Jerk");
    }

    public WorkoutLog() { // class instantiated

    }


}
