public class Product {
   private double quantity;
    private double price;
    private String name;

    public Product(double price, double quantity,String name){
        this.quantity = quantity;
        this.price =  price;
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public double getQuantity() {
        return quantity;
    }
    public String getName(){
        return name;
    }
}
