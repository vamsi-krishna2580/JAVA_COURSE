import java.sql.Connection;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try {

            Connection conn =
                    DBConnection.getConnection();

            System.out.println("Connected Successfully");

            conn.close();

        } catch (Exception e) {

            e.printStackTrace();

        }


        Scanner sc = new Scanner(System.in);
        Library lib = new Library();

        while (true) {

            System.out.println("\n====== LIBRARY MENU ======");
            System.out.println("1. Add Book");
            System.out.println("2. Add DVD");
            System.out.println("3. Add Magazine");
            System.out.println("4. View All Items");
            System.out.println("5. Add Student");
            System.out.println("6. Add Faculty");
            System.out.println("7. View Members");
            System.out.println("8. Search Item By ID");
            System.out.println("9. Issue Item");
            System.out.println("10. Return Item");
            System.out.println("11. View Issued Items");
            System.out.println("12. Exit");
            System.out.print("Enter Choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1: // Add Book

                    System.out.print("Enter Item ID: ");
                    int bookId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Title: ");
                    String bookTitle = sc.nextLine();

                    System.out.print("Enter Publication Year: ");
                    int bookYear = sc.nextInt();

                    System.out.print("Enter Availability: ");
                    boolean bookAvail = sc.nextBoolean();

                    System.out.print("Enter ISBN: ");
                    int isbn = sc.nextInt();

                    System.out.print("Enter Number Of Pages: ");
                    int pages = sc.nextInt();

                    Book b = new Book(
                            bookId,
                            bookTitle,
                            bookYear,
                            bookAvail,
                            isbn,
                            pages
                    );

                    lib.addItem(b);
                    System.out.println("Book Added Successfully");
                    break;

                case 2: // Add DVD

                    System.out.print("Enter Item ID: ");
                    int dvdId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Title: ");
                    String dvdTitle = sc.nextLine();

                    System.out.print("Enter Publication Year: ");
                    int dvdYear = sc.nextInt();

                    System.out.print("Enter Availability: ");
                    boolean dvdAvail = sc.nextBoolean();
                    sc.nextLine();

                    System.out.print("Enter Duration: ");
                    int duration = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Genre: ");
                    String genre = sc.nextLine();

                    DVD dvd = new DVD(
                            dvdId,
                            dvdTitle,
                            dvdYear,
                            dvdAvail,
                            duration,
                            genre
                    );

                    lib.addItem(dvd);
                    System.out.println("DVD Added Successfully");
                    break;

                case 3: // Add Magazine

                    System.out.print("Enter Item ID: ");
                    int magId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Title: ");
                    String magTitle = sc.nextLine();

                    System.out.print("Enter Publication Year: ");
                    int magYear = sc.nextInt();

                    System.out.print("Enter Availability: ");
                    boolean magAvail = sc.nextBoolean();
                    sc.nextLine();

                    System.out.print("Enter Issue Number: ");
                    int issueNumber = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Publication Month: ");
                    String month = sc.nextLine();

                    Magazine mag = new Magazine(
                            magId,
                            magTitle,
                            magYear,
                            magAvail,
                            issueNumber,
                            month
                    );

                    lib.addItem(mag);
                    System.out.println("Magazine Added Successfully");
                    break;

                case 4: // View Items

                    lib.displayAllItems();
                    break;

                case 5: // Add Student

                    System.out.print("Enter Member ID: ");
                    int stuId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Member Name: ");
                    String stuName = sc.nextLine();

                    System.out.print("Enter Branch: ");
                    String branch = sc.nextLine();

                    System.out.print("Enter Batch Number: ");
                    int batch = sc.nextInt();

                    Student s = new Student(
                            stuId,
                            stuName,
                            branch,
                            batch
                    );

                    lib.addMember(s);
                    System.out.println("Student Added Successfully");
                    break;

                case 6: // Add Faculty

                    System.out.print("Enter Member ID: ");
                    int facId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Member Name: ");
                    String facName = sc.nextLine();

                    System.out.print("Enter Department: ");
                    String dept = sc.nextLine();

                    Faculty f = new Faculty(
                            facId,
                            facName,
                            dept
                    );

                    lib.addMember(f);
                    System.out.println("Faculty Added Successfully");
                    break;

                case 7: // View Members

                    lib.displayAllMembers();
                    break;

                case 8: // Search Item

                    System.out.print("Enter Item ID: ");
                    int searchId = sc.nextInt();

                    Item found = lib.searchItem(searchId);

                    if (found != null) {
                        found.displayDetails();
                    } else {
                        System.out.println("Item Not Found");
                    }

                    break;

                case 9: // Issue Item

                    System.out.print("Enter Member ID: ");
                    int memberId = sc.nextInt();

                    System.out.print("Enter Item ID: ");
                    int itemId = sc.nextInt();

                    lib.issueItem(memberId, itemId);
                    break;

                case 10: // Return Item

                    System.out.print("Enter Item ID: ");
                    int returnItemId = sc.nextInt();

                    lib.returnItem(returnItemId);
                    System.out.println("Item Returned Successfully");
                    break;

                case 11: // View Issued Items

                    lib.displayIssuedItems();
                    break;

                case 12:

                    System.out.println("Thank You");
                    sc.close();
                    return;

                default:

                    System.out.println("Invalid Choice");
            }
        }
    }
}