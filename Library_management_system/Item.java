//import java.util.ArrayList;

class Item{
    private int itemId;
    private String title;
    private int publicationYear;
    private boolean availableStatus;
    //private ArrayList<Item> items;
    
    Item(int itemId, String title, int publicationYear, boolean availableStatus){
        this.availableStatus = availableStatus;
        this.itemId = itemId;
        this.publicationYear = publicationYear;
        this.title = title;
    }

    void displayDetails(){
        System.out.println("ItemId :- "+ itemId);
        System.out.println("Title :- "+ title);
        System.out.println("PublicationYear :- "+ publicationYear);
        System.out.println("AvailableStatus :- "+ availableStatus);
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public boolean isAvailableStatus() {
        return availableStatus;
    }

    public void setAvailableStatus(boolean availableStatus) {
        this.availableStatus = availableStatus;
    }


}