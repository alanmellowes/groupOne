public class NewAccount {

    public NewAccount() {
    }

    public NewAccount(int id, int customer_id, double balance, String account_type, int sort_code, int account_number) {
        this.id = id;
        this.customer_id = customer_id;
        this.balance = balance;
        this.account_type = account_type;
        this.sort_code = sort_code;
        this.account_number = account_number;
        this.customers = new ArrayList<Customer>();
    }


        public String getAccount_type() {
        return account_type;
    }

    public void setAccount_type(String acc_type) {
        this.account_type = account_type;
    }

