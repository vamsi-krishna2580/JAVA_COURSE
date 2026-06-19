public class DVD extends Item {
    private int Duration;
    private String Genre;

    public int getDuration() {
        return Duration;
    }

    public void setDuration(int duration) {
        Duration = duration;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String genre) {
        Genre = genre;
    }

    DVD(int itemId, String title, int publicationYear, boolean availableStatus, int Duration, String Genre){
        super(itemId, title, publicationYear, availableStatus);
        this.Duration = Duration;
        this.Genre = Genre;
    }
    void displayDetails(){
        System.out.println("ItemId :- "+ this.getItemId());
        System.out.println("Title :- "+ this.getTitle());
        System.out.println("PublicationYear :- "+ this.getPublicationYear());
        System.out.println("AvailableStatus :- "+ this.isAvailableStatus());
        System.out.println("Duration :- "+ this.getDuration());
        System.out.println("Genre :- "+ this.getGenre());
    }
}
