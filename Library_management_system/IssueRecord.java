public class IssueRecord {
    private int memberId;
    private int itemId;
    private String issueDate;

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    private String returnDate;

    public IssueRecord(int memberId, int itemId, String issueDate) {
        this.memberId = memberId;
        this.itemId = itemId;
        this.issueDate = issueDate;
        this.returnDate = "Not returned";
    }

    void displayDetails(){
        System.out.println("Member ID :- "+this.getMemberId());
        System.out.println("Item ID :- "+this.getItemId());
        System.out.println("Issue Date :- "+this.getIssueDate());
        System.out.println("Return Date :- "+this.getReturnDate());
    }


}
