import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        Library lib = new Library();

        while(true) {
            System.out.println("====== LIBRARY MENU ======");
            System.out.println("1. Add Book");
            System.out.println("2. View Items");
            System.out.println("3. Exit");
            System.out.println();

            int choice = sc.nextInt();

            switch(choice){
                case 1:
                    System.out.println("Enter Item ID: ");
                    int ItemId = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter Title: ");
                    String Title = sc.nextLine();
                    System.out.println("Enter Publication Year: ");
                    int year = sc.nextInt();
                    System.out.println("Enter Availability: ");
                    boolean avail = sc.nextBoolean();
                    System.out.println("Enter ISBN: ");
                    int ISBN = sc.nextInt();
                    System.out.println("Enter Number of Pages: ");
                    int no_of = sc.nextInt();
                    Book b = new Book(ItemId,Title, year, avail, ISBN, no_of);
                    lib.addItem(b);
                    System.out.println("Book Added Successfully");
                    break;
                case 2:
                    lib.displayAllItems();
                    break;
                case 3:
                    System.out.println("Thank You");
                    return;
            }
        }
    }
}
