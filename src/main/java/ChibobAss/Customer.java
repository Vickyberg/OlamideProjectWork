package ChibobAss;

import java.util.ArrayList;

public class Customer {
    public  ArrayList <Material> items = new ArrayList<>();
    private String customer;

    public void setCustomer(String name) {
        customer = name;
    }

    public String getCustomer() {
        return customer;
    }


    public void setItems(String itemName, int quantity, double price, double totalPrice){
        Material item = new Material(itemName,quantity,price,totalPrice);
        items.add(item);
    }

    @Override
    public String toString() {
        String itemList = " ";
        for (Material item: items) {
            itemList = itemList + item.getItemName() + "          "  + item.getQuantity() + "      "  + item.getPrice() + "      "  + item.getTotalPrice() +"\n";
        }
        return itemList;
    }
}
