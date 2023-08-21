public class Customer {
    private String customerName;

    private double creditLimit;

    private String emailAddress;

    public String getCustomerName() {
        return customerName;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public Customer(){
        this("DefaultName", "dafaultEmail@service.com");
    }

    public Customer(String name, String emailAddress){
        this(name, 1000, emailAddress);
    }

    public Customer(String customerName, double creditLimit, String emailAddress) {
        this.customerName = customerName;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }


}
