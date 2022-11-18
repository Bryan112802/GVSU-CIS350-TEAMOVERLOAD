
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.io.FileInputStream;
import java.util.*;


public class LogHistory {

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
                if(scnr.next().equals("")) {
                    return;
                }
                scnr.nextLine();

                while(scnr.hasNext()) {
                    // reads each record of the file
                    String data = scnr.nextLine();
                    /* FIX THIS LATER */
                    //WorkoutLog readData = new WorkoutLog(data);
                    //history.add(readData);
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
}
