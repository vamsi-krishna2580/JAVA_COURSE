import java.util.ArrayList;

public class Library {
    private ArrayList<Item> items;
    private ArrayList<Member> members;
    private ArrayList<IssueRecord> issuedItems;

    public Library() {
        this.items = new ArrayList<>();
        this.members = new ArrayList<>();
        this.issuedItems = new ArrayList<>();
    }

    void addItem(Item item){
        items.add(item);
    }
    void addMember(Member member){
        members.add(member);
    }

    void displayAllItems(){
        for (Item item : items){
            item.displayDetails();
        }
    }
    void displayAllMembers(){
        for (Member member: members){
            member.dispalyDetails();
        }
    }
    public Item searchItem(int itemId) {
        for (Item item : items) {
            if (item.getItemId() == itemId) {
                return item;
            }
        }
        return null;
    }
    Member searchMember(int memberId){
        for(Member member: members){
            if (member.getMemberId() == memberId){
                return member;
            }
        }
        return null;
    }
}
