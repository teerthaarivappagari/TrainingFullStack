class Vehicle { 
    void display() { 
      System.out.println("This is a vehicle"); 
    } 
}
 class Car extends Vehicle {
     void display() { 
        System.out.println("This is a car"); 
    }
 }
  class VehicleInheritanceSystem extends Vehicle { 
    void display() {
         System.out.println("This is a bike");
     }
    public static void main(String[] args) {
     Vehicle v = new Car(); 
     v.display();
     v=new VehicleInheritanceSystem();
     v.display();
        }
   }

