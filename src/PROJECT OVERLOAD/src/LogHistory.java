import java.io.File;
import java.io.IOException;









public class LogHistory {


    public LogHistory() {

    }

    public static void initializeArray() {
        if(new File("logHistory.txt").isFile()) {
            //read to array
        }
        else {
            File logHistory = new File("logHistory.txt");
        }
    }
}
