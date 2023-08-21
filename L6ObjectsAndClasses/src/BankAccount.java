public class BankAccount {
    private long accountNumber;

    private double accountBalance;

    private String customerName;

    private String emailId;

    private long phoneNumber;

    public BankAccount(){

        // Constructor Chaining: this keyword is used to set the default values of BankAccount based on
        // the constructor defined below in case non args constructor is called.
        // This should also be the first line in the constructor
        this(12345, 234.5, "Default name",
                "defaul@email.com", 121212);

        System.out.println("Empty Constructor Called");
    }

    public BankAccount(long accountNumber, double accountBalance,
                       String customerName, String email, long phone){
        System.out.println("Account Constructor with Parameters Called");

        // Some parameter names can be same as field names in the constructor so use this keyword
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;

        // It is good practice to have parameter names same as field names. But in case
        // it is not, then this keyword is not required
        emailId = email;
        phoneNumber = phone;
    }

    public BankAccount(String customerName, String email, long phone){
        this(12345, 0.00, customerName, email, phone);
        System.out.println("Account Constructor with 3 Parameters Called");
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFund(double amount) {
        System.out.println("Balance before deposit: " + accountBalance);
        accountBalance+=amount;
        System.out.println("The amount deposited: " + amount);
        System.out.println("The current balance is: " + accountBalance);
    }

    public void withdrawFund(double amount) {
        if (accountBalance - amount < 0.0){
            System.out.println("Cannot withdraw funds. ");
        } else {
            System.out.println("Balance before withdrawal: " + accountBalance);
            accountBalance-=amount;
            System.out.println("The amount withdrawn: " + amount);
            System.out.println("The current balance is: " + accountBalance);
        }
    }
}
