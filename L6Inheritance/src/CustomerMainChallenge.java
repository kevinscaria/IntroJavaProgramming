public class CustomerMainChallenge {

    public static void main(String[] args) {

        // No args constructor - Default Customer
        Customer defaultCustomer = new Customer();
        System.out.println("Customer Name: " + defaultCustomer.getCustomerName());
        System.out.println("Customer Email: " + defaultCustomer.getEmailAddress());
        System.out.println("Customer Credit Limit: " + defaultCustomer.getCreditLimit());

        // Customer constructor with all parameters
        Customer kevin = new Customer("Kevin Scaria", 3000, "ks@email.com");
        System.out.println("Customer Name: " + kevin.getCustomerName());
        System.out.println("Customer Email: " + kevin.getEmailAddress());
        System.out.println("Customer Credit Limit: " + kevin.getCreditLimit());

        // Customer constructor with 2 parameters
        Customer john = new Customer("John Doe", "jd@email.com");
        System.out.println("Customer Name: " + john.getCustomerName());
        System.out.println("Customer Email: " + john.getEmailAddress());
        System.out.println("Customer Credit Limit: " + john.getCreditLimit());

    }
}
