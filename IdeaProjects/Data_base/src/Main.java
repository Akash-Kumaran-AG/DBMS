public static void main() throws IOException {
    Scanner in=new Scanner(System.in);
    System.out.println("1. CREATE\n" +
            "2. INSERT\n" +
            "3. SELECT\n" +
            "4. EXIT");
    System.out.println("Enter your choice: ");
    int choice=in.nextInt();
    in.nextLine();
    switch(choice){
        case 1:
            Create_table create=new Create_table();
            System.out.println("Enter the table name: ");
            String tname=in.nextLine();
            create.create_table(tname);
            break;
        case 2:
                Insert_table insert=new Insert_table();
//                System.out.println("Which database should you update");
//                Show show=new Show();
//                show.showdb();
                insert.insert();
                break;
        case 3:
            Select_data select= new Select_data();

            break;

        default:
    }
}
