abstract class OnlineShoppingAbstraction {
 abstract void addItem(); 
 abstract void checkout();
 }
  class Amazon extends OnlineShoppingAbstraction {
void addItem() { 
    System.out.println("Item added to cart");
 }
  void checkout() { 
    System.out.println("Proceeding to payment");
 }
  public static void main(String[] args) {
     Amazon shop = new Amazon();
      shop.addItem(); shop.checkout();
     }
     }


