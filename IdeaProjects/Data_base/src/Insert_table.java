import javax.net.ssl.SSLContext;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Insert_table {
//    private static final File BASE_FOLDER = new File("/home/akash-pt8147/IdeaProjects/Demo");
//
//    public void insert(){
//        File[] files = BASE_FOLDER.listFiles();
//
//        if (files != null) {
//            for (File f : files) {
//                if (f.isDirectory()) {
//                    System.out.println(f.getName());
//                }
//            }
//        }
//    }
    File home=new File("/home/akash-pt8147/IdeaProjects/Demo/eight");
    File file=new File(home,"schema.meta");
    public void insert() throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(file,true));

        Scanner in=new Scanner(System.in);
        Create_table insert=new Create_table();
        ArrayList<String>temp=new ArrayList<>();
//            rows.add(new ArrayList<String>());
        System.out.println("Enter your row ");
        boolean is_next=true;
        while(is_next) {
            is_next=false;
//            int col_nums= Create_table.rows.get(0).size();

            for (int i = 0; i < 3; i++) {

//                if(i!=col_nums-1){
                String st = in.nextLine();
                temp.add(String.valueOf(st));
                if (i != 2) {
                    writer.write(st + " | ");
                } else {
                    writer.write(st);
                    writer.newLine();
                }
            }
            Create_table.rows.add(temp);
            System.out.println("Is there another row?(Y?N)");
            String another=in.nextLine();
            if(another.equals("Y")) is_next=true;

        }
        writer.close();

    }
}
