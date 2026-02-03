package challenges.challenge2.bank.test;

import challenges.challenge2.bank.users.SavingsUser;

public class ExternalTester {
    public static void main(String[] args) {
        SavingsUser obj = new SavingsUser();
        obj.method();
        //auditLog(); doesn't work because Externaltester doesn't extends AccountBase
    }   
}
