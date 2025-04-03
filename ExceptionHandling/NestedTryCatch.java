    class ATM { 
        public static void simulateTransaction() { 
            try {
                 int amount = 10000; 
                 try {
                     if (amount > 1000) { 
                        throw new ArithmeticException("Withdrawal limit exceeded!"); 
                    } 
                    System.out.println("Transaction successful!"); 
                }
                 catch (ArithmeticException e) {
                     System.out.println("Transaction error: " + e.getMessage());
                     } 
                    } 
                    catch (Exception e) { 
                        System.out.println("Unexpected error: " + e.getMessage());
                    }
                }
            }
            public class NestedTryCatch {
                public static void main(String[] args) {
                    ATM.simulateTransaction();
                    
                }
    
}
