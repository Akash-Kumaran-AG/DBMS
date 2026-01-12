import java.io.*;
import java.util.*;

public class Select_data {

    File home = new File("/home/akash-pt8147/IdeaProjects/Demo/eight");
    File file = new File(home, "schema.meta");

    public void select() throws IOException {

        Scanner in = new Scanner(System.in);

        System.out.print("Select by column name: ");
        String column = in.nextLine();

        System.out.print("Select by value: ");
        String value = in.nextLine();

        BufferedReader reader = new BufferedReader(new FileReader(file));

        // Read table name
        reader.readLine();

        // Read schema line
        String schemaLine = reader.readLine();
        String[] columns = schemaLine.split("\\|");

        int colIndex = -1;

        for (int i = 0; i < columns.length; i++) {
            String colName = columns[i].split("-")[0].trim();
            if (colName.equals(column)) {
                colIndex = i;
                break;
            }
        }

        if (colIndex == -1) {
            System.out.println("Column not found!");
            return;
        }

        System.out.println("\n--- RESULT ---");

        String row;
        while ((row = reader.readLine()) != null) {
            String[] data = row.split("\\|");

            if (data[colIndex].trim().equals(value)) {
                System.out.println(row);
            }
        }

        reader.close();
    }
}
