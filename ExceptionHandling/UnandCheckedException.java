import java.lang.Exception;
 class InsufficientFundsException extends Exception { 
    public InsufficientFundsException(String message) { 
        super(message); 
    }
 }
    class BankAccount { 
        private double balance;
    public BankAccount(double balance) {
        this.balance = balance;
    }
    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient balance!");
        }
        balance -= amount;
    }
    }
    public class UnandCheckedException {
        public static void main(String[] args){
            BankAccount b=new BankAccount(10000);
            try{
            b.withdraw(50000);
            }
            catch(InsufficientFundsException e){
                System.out.println(e.getMessage());
            }

            
        }
    }
       
