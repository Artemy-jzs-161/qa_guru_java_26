package HashSetATM;

import java.util.HashSet;
import java.util.Set;

public class ATM {
    private Set<Account> accountSet = new HashSet<>();

    public void addAccount(Account account) {
        accountSet.add(account);
    }

    public boolean removeAccount(Account account) {
        return accountSet.remove(account);
    }

    public boolean searchAccount(Account account) {
        return accountSet.contains(account);
    }

    public void iterateAccounts() {
        for (Account account : accountSet) {
            System.out.println(account);
        }
    }

    @Override
    public String toString() {
        return "ATM{" +
                "accountSet=" + accountSet +
                '}';
    }
}