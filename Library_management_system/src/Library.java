import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;

public class Library {
    final private ArrayList<Item> items;
    final private ArrayList<Member> members;
    final private ArrayList<IssueRecord> issuedItems;

    public Library() {
        this.items = new ArrayList<>();
        this.members = new ArrayList<>();
        this.issuedItems = new ArrayList<>();
    }

    // Items
    Item searchItem(int itemId) {
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

//    void addItem(Item item) {
//        try {
//            Connection conn =
//                    DBConnection.getConnection();
//
//            String sql =
//                    "INSERT INTO items VALUES(?,?,?,?,?)";
//
//            PreparedStatement ps =
//                    conn.prepareStatement(sql);
//
//            ps.setInt(1, item.getItemId());
//            ps.setString(2, item.getTitle());
//            ps.setInt(3, item.getPublicationYear());
//            ps.setBoolean(4, item.isAvailableStatus());
//
//            ps.setString(
//                    5,
//                    item.getClass().getSimpleName()
//            );
//
//            ps.executeUpdate();
//
//            System.out.println("Inserted Into DB");
//
//            conn.close();
//
//        } catch(Exception e){
//            e.printStackTrace();
//        }
//    }

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
                if (!item.isAvailableStatus()) {
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
            }
        } else {
            System.out.println("Member not found");
        }
    }

}
