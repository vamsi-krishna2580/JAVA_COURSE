package challenges.challenge1;

public class demo {
    public static void main(String[] args) {
        BaseAccount acc = new PremiumSavingsAccount();
        System.out.println(acc.balence);
        acc.caluclateInterest();
    }
}
