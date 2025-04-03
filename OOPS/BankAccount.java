public class BankAccount {
    BankAccount() {
    System.out.println("Bank Account Created");
 }
 }
  class SavingsAccount extends BankAccount {
     SavingsAccount() {
        
        super(); // Eventhough if we donot mention/calls explicitly the java will implicitly calls
        System.out.println("Savings Account Created");
         }
    public static void main(String[] args) {
         new SavingsAccount();
         }
         }

    

