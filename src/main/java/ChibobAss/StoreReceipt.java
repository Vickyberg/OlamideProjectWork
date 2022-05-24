package ChibobAss;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;
import java.util.Scanner;

public class StoreReceipt {
    public static void main(String[] args) {

        double subTotal = 0;
        double discount = 37.00;



        String timestamp = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(new Date());
        Scanner input = new Scanner(System.in);

        Material item = new Material();
        Customer receipt = new Customer();

        System.out.println("Name of cashier: ");
        String cashier = input.nextLine();
        System.out.println("Name of customer: ");
        String customer = input.nextLine();

        receipt.setCustomer(customer);
        String inputByCashier = "Yes";


        while (Objects.equals(inputByCashier, "Yes")){
            System.out.println("What did " + customer + " buy ? " );
            String productName = input.nextLine();
            item.itemName(productName);

            System.out.println("How many pieces of " + productName + "?" );
            int quantity = input.nextInt();
            item.quantity(quantity);

            System.out.println("How much per unit of " + productName + "?");
            double price = input.nextDouble();
            item.price(price);
            item.setTotalPrice();
            input.nextLine();

            double totalPrice = item.getTotalPrice();
            subTotal += totalPrice;

            receipt.setItems(productName, quantity, price,totalPrice);
            System.out.println("Add more item? ");
            inputByCashier = input.nextLine();



        }
        double VAT = (17.50 / 100) * subTotal;
        double totalBill = subTotal - discount + VAT;

        String myStoreDetails = """
                        OLAMIDE STORES
                        MAIN BRANCH
                        LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.
                        TEL: +2348161172433, +2348142700448
                        """;
        System.out.printf("%s%nDate: %s%nCashier: %s%nCustomer's Name: %s%n", myStoreDetails,timestamp,cashier,customer);
        System.out.println("=".repeat(50));
        System.out.printf("%-10s%-10s%-10s%10s%n", "ITEM","QTY","PRICE","TOTAL(NGN)");
        System.out.println("-".repeat(50));
        System.out.println(receipt);
        System.out.println("-".repeat(50));
        System.out.printf("%25s%10.2f%n", "Sub Total: ", subTotal);
        System.out.printf("%25s%10.2f%n","Discount: " ,discount);
        System.out.printf("%25s%10.2f%n","VAT @ 17.50%: ", VAT);
        System.out.println("=".repeat(50));
        System.out.printf("%25s%10.2f%n", "Total Bill: ", totalBill);
        System.out.println("=".repeat(50));
        System.out.println("THIS IS YOUR RECEIPT KINDLY PAY " + totalBill  );
        System.out.println("=".repeat(50));






    }
}
