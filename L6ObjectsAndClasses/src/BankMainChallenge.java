public class BankMainChallenge {
    public static void main(String[] args) {
        BankAccount abynBank = new BankAccount();
        BankAccount kevinBank = new BankAccount();

        // Use new constructor created
        BankAccount benBank = new BankAccount(123123123, 12000,
                "Ben Scaria", "bscaria@graymail.com", 123234345
                );

        // Use constructor with 3 parameters
        BankAccount bankAccount = new BankAccount("Rose", "rose@email.com", 123123);


        // Setter Methods
        kevinBank.setCustomerName("Kevin Scaria");
        kevinBank.setAccountBalance(4134.02);
        kevinBank.setAccountNumber(12345678);
        kevinBank.setEmailId("sk@graymail.com");
        kevinBank.setPhoneNumber(12345678);

        abynBank.setCustomerName("Abyn Scaria");
        abynBank.setAccountBalance(413434.02);
        abynBank.setAccountNumber(12355678);
        abynBank.setEmailId("ak@graymail.com");
        abynBank.setPhoneNumber(23345678);

        // Getter Methods and Details Updates
        System.out.println("****** Graybank ******");
        System.out.println("Customer: " + kevinBank.getCustomerName());
        System.out.println("Account Number: " + kevinBank.getAccountNumber());
        System.out.println("Email Id: " + kevinBank.getEmailId());
        System.out.println("Phone Number: " + kevinBank.getPhoneNumber());
        System.out.println("Account Balance: " + kevinBank.getAccountBalance());
        kevinBank.depositFund(200);
        System.out.println("Account Balance: " + kevinBank.getAccountBalance());
        kevinBank.withdrawFund(1200);
        System.out.println("Account Balance: " + kevinBank.getAccountBalance());

        System.out.println("****** Graybank ******");
        System.out.println("Customer: " + abynBank.getCustomerName());
        System.out.println("Account Number: " + abynBank.getAccountNumber());
        System.out.println("Email Id: " + abynBank.getEmailId());
        System.out.println("Phone Number: " + abynBank.getPhoneNumber());
        System.out.println("Account Balance: " + abynBank.getAccountBalance());
        abynBank.depositFund(200);
        System.out.println("Account Balance: " + abynBank.getAccountBalance());
        abynBank.withdrawFund(1200);
        System.out.println("Account Balance: " + abynBank.getAccountBalance());
    }
}
