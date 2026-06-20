public class Magazine extends Item {
    private int Issue_Number;
    private String publication_month;

    public int getIssue_Number() {
        return Issue_Number;
    }

    public void setIssue_Number(int issue_Number) {
        Issue_Number = issue_Number;
    }

    public String getPublication_month() {
        return publication_month;
    }

    public void setPublication_month(String publication_month) {
        this.publication_month = publication_month;
    }

    Magazine(int itemId, String title, int publicationYear, boolean availableStatus, int Issue_number, String publication_month) {
        super(itemId, title, publicationYear, availableStatus);
        this.Issue_Number = Issue_Number;
        this.publication_month = publication_month;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("IssueNumber :- " + this.getIssue_Number());
        System.out.println("Publication_month :- " + this.getPublication_month());
    }
}