package ChibobAss;

public class Material {
    private String itemName;
    private int quantity;
    private double price;
    private double totalPrice;


    public Material(String itemName, int quantity, double price, double totalPrice){
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
        this.totalPrice = totalPrice;
    }

    public Material() {

    }



    public void itemName(String productName) {
        itemName = productName;
    }
    public String getItemName() {
        return itemName;
    }

    public void quantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void price(double price) {
        this.price = price;
    }
    public double getPrice(){
        return price;
    }


    public void setTotalPrice(){
       totalPrice = quantity * price;
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}
