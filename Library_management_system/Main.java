public class Main {
    public static void main(String args[]){

        Book book1 = new Book(101, "maths", 2026, true, 12345, 100);
        DVD dvd1 = new DVD(102,"matsh tutorials", 2025, true, 2, "Education");
        Student s1 = new Student(101,"Vamsi", "CSE-AI", 2024);
        Faculty f1 = new Faculty(101, "Krishna", "CSE");


        Library lib = new Library();
        lib.addItem(book1);
        lib.addItem(dvd1);

        lib.addMember(s1);
        lib.addMember(f1);

        lib.displayAllItems();
        lib.displayAllMembers();
    }
}
