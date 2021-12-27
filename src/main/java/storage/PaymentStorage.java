
package storage;

import com.nciwebapi.groupone.Payment;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Alan.Mellowes
 */
public class PaymentStorage {
        private static Map<Integer, Payment> storage;
        private static PaymentStorage instance = null;

private static void initPayments(){
}

        private PaymentStorage(){
    storage = new HashMap<Integer, Payment>();
    initPayments();
}
    public  static Map<Integer, Payment> getStorage(){
        if(instance==null){
            instance = new PaymentStorage();
    }
    return storage;
    }
    
}
