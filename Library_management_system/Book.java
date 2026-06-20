public class Book extends Item {
    private String Author;
    private int ISBN;
    private int no_pages;
    
    Book(int itemId, String title, int publicationYear, boolean availableStatus, int ISBN, int no_pages){
         super(itemId, title, publicationYear, availableStatus);
         this.ISBN = ISBN;
         this.no_pages = no_pages;
    }

    void displayDetails(){
        super.displayDetails();
        System.out.println("ISBN :- "+ this.getISBN());
        System.out.println("No_of_pages :- "+ this.getNo_pages());
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public int getNo_pages() {
        return no_pages;
    }

    public void setNo_pages(int no_pages) {
        this.no_pages = no_pages;
    }
}
