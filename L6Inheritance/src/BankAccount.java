public class BankAccount {
    private long accountNumber;

    private double accountBalance;

    private String customerName;

    private String emailId;

    private long phoneNumber;

    public BankAccount(){
        System.out.println("Empty Constructor Called");
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
