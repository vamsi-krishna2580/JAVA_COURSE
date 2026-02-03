package challenges.challenge1;

public class SavingsAccount extends BaseAccount {
    int balence = 1000;

    SavingsAccount() {
        System.out.println("Savings Constructor");
    }

    void caluclateInterest() {
        System.out.println("Savings Interest");
    }
}
