package Models;

public class Product {
  private int id;
  private String name, discription;
  private double price;

  public Product(int id,String name,String discription,double price) {
    this.id=id;
    this.name=name;
    this.discription=discription;
    this.price=price;
  }
  public int getId() {return id;}
  public String getName() {return name;}
  public String getDesc() {return discription;}
  public double getPrice() {return price;}
}