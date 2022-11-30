
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.io.FileInputStream;
import java.util.*;


public class LogHistory extends WorkoutLog{

    public static ArrayList<WorkoutLog> history;
    public static File file = new File("loghistory.txt");

    public static void initializeArray() {
        history = new ArrayList<WorkoutLog>();

        if(file.isFile()) {
            try{
                FileInputStream fileByteStream = new FileInputStream(file.getPath());
                if(file.length() == 0) {
                    return;
                }
                Scanner scnr = new Scanner(fileByteStream);

                scnr.nextLine();

                while(scnr.hasNext()) {
                    // reads each record of the file
                    String data = scnr.nextLine();
                    WorkoutLog readData = new WorkoutLog(data);
                    history.add(readData);
                }
                fileByteStream.close();
            }
            catch(IOException e) {
                System.out.println("Failed to read the data file: " + "loghistory.txt");
            }

        }
        else {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }



    public static void displayHistory() {
        System.out.println("Your Log History");
        System.out.println();
        for (int i = 0; i < history.size(); i++) {
            System.out.println("Date: " + (history.get(i)).getDate());
            System.out.println("Exercise: " + (history.get(i)).getWorkout());
            int repTr = 0;
            for (int j = 0; j < history.get(i).getSets(); j++){
                String delim = " ";
                String[]tokens = ((history.get(i)).getRepWeight()).split(delim);
                System.out.println("Set " + (j+1) + ": " + tokens[repTr] + " lbs for " + tokens[repTr+1] + " reps");
                repTr += 2;

            }
            System.out.println();
        }

    }
}
