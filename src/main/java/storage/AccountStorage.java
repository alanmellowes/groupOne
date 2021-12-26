package storage;

import com.nciwebapi.groupone.Account;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author florm
 */
public class AccountStorage {

    private static Map<Integer, Account> store;
    private static AccountStorage instance = null;

    public AccountStorage() {
        store = new HashMap<Integer, Account>();
        initAccounts();
    }

    public static Map<Integer, Account> getStore() {
        if (instance == null) {
            instance = new AccountStorage();
        }
        return store;
    }

    private static void initAccounts() {
        Account Michel = new Account(1, 1, 50000, "deposit account", 800121, 13357436);
        Account Paul = new Account(2, 2, 80000, "saving account", 155789, 27653598);

        store.put(Michel.getId(), Michel);
        store.put(Paul.getId(), Paul);

    }
}
