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

    // Items
    public Item searchItem(int itemId) {
        for (Item item : items) {
            if (item.getItemId() == itemId) {
                return item;
            }
        }
        return null;
    }

    void addItem(Item item) {
        items.add(item);
    }

    void displayAllItems() {
        for (Item item : items) {
            item.displayDetails();
        }
    }

    void returnItem(int itemId) {
        Item item = searchItem(itemId);
        if (item != null) {
            item.setAvailableStatus(true);
            for (IssueRecord issueItem : issuedItems) {
                if (issueItem.getItemId() == itemId) {
                    issueItem.setReturnDate("21-06-2026");
                    break;
                }
            }

        } else {
            System.out.println("No such returnable item");
        }
    }

    // Members
    void addMember(Member member) {
        members.add(member);
    }

    void displayAllMembers() {
        for (Member member : members) {
            member.displayDetails();
        }
    }

    Member searchMember(int memberId) {
        for (Member member : members) {
            if (member.getMemberId() == memberId) {
                return member;
            }
        }
        return null;
    }


    //IssueRecords
    void displayIssuedItems() {
        for (IssueRecord issuedItem : issuedItems) {
            issuedItem.displayDetails();
        }
    }

    void issueItem(int memberId, int itemId) {
        Member member = searchMember(memberId);
        Item item = searchItem(itemId);
        if (member != null) {
            if (item != null) {
                if (item.isAvailableStatus() == false) {
                    System.out.println("Item already issued");
                    return;
                }
                String issueDate = "20-06-2026";
                IssueRecord issueRecord = new IssueRecord(memberId, itemId, issueDate);
                issuedItems.add(issueRecord);
                item.setAvailableStatus(false);
                System.out.println("Item issued successfully");
            } else {
                System.out.println("Item not found");
                return;
            }
        } else {
            System.out.println("Member not found");
            return;
        }
    }

}
