package storage;

import com.nciwebapi.groupone.Customer;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author florm
 */
public class CustomerStorage {

    private static Map<Integer, Customer> store;
    private static CustomerStorage instance = null;

    private CustomerStorage() {
        store = new HashMap<Integer, Customer>();
        initCustomers();
    }

    public static Map<Integer, Customer> getStore() {
        if (instance == null) {
            instance = new CustomerStorage();
        }
        return store;
    }

    private static void initCustomers() {
        Customer michel = new Customer(1, "Michel Browns", "mb", "Dame Str, Dublin, Ireland", "michel@test.com");
        Customer paul = new Customer(2, "Paul Brians", "paulb", "Talbot Str, Dublin, Ireland", "paul.brians@test.com");

        store.put(michel.getId(), michel);
        store.put(paul.getId(), paul);

    }
}
