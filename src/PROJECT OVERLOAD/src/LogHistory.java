import java.io.File;
import java.io.IOException;

public class LogHistory {

    public static void initializeArray() {
        File file = new File("loghistory.txt");

        if(file.isFile()) {
            //read file
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
