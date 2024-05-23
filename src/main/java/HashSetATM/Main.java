package HashSetATM;

public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM();
        Account account1 = new Account("123456", "Artem", 1000.0);
        Account account2 = new Account("654321", "Anna", 1500.0);
        Account account3 = new Account("112233", "Max", 2000.0);

        atm.addAccount(account1);
        atm.addAccount(account2);
        atm.addAccount(account3);

        System.out.println("Initial Accounts: " + atm);

        boolean found = atm.searchAccount(account2);
        System.out.println("Account found: " + found);

        System.out.println("Iterating accounts:");
        atm.iterateAccounts();

        boolean removed = atm.removeAccount(account1);
        System.out.println("Account removed: " + removed);

        System.out.println("Accounts after remove: " + atm);
    }
}
