import java.io.File;
import java.util.ArrayList;

public class Show {
    private static final File BASE_FOLDER = new File("/home/akash-pt8147/IdeaProjects/Demo");

//    public static ArrayList<String> databaseNames = new ArrayList<>();
public static File[] files = BASE_FOLDER.listFiles();

    public void showdb() {
//        databaseNames.clear();

//        File[] files = BASE_FOLDER.listFiles();

        if (files != null) {
            for (File f : files) {
                if (f.isDirectory()) {
                    System.out.println(f.getName());
                }
            }
        }
    }
}
