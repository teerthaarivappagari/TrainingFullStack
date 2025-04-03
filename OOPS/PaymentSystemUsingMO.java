class PaymentSystemUsingMO {
 void pay(int amount) {
     System.out.println("Paid Rs." + amount + " using Cash"); 
     }
 void pay(String cardNumber, double amount) {
     System.out.println("Paid Rs." + amount + " using Card: " + cardNumber);
      } 
       public static void main(String[] args) {
        PaymentSystemUsingMO p = new PaymentSystemUsingMO(); 
        p.pay(1000); 
        p.pay("1234-5678-9012", 5000); 
         }
     }

