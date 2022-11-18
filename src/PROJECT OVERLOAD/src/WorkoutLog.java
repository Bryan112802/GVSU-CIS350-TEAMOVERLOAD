
import java.util.*;

public class WorkoutLog {

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

    public void addWorkout(int workout) {
        this.workout = workouts.get(workout - 1);
    }

    public void addDate(String date) {
        this.date = date;
    }






}
