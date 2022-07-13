package ChapterTen.Interface;

public class PayableInterfaceTest {
    public static void main(String[] args) {
        Payable [] payableObjects = new Payable[]{
                new Invoice("01234","Seat",2,375.5),
                new Invoice("22342","Tire",4,79.96),
                new SalariedEmployee("John","Doe","234-443-455",800.00),
                new SalariedEmployee("Jane","Mary","123-443-453",1200.00)

        };
        System.out.println("=".repeat(50));
        System.out.println("INVOICES AND EMPLOYEES PROCESSED POLYMORPHICALLY");
        System.out.println("=".repeat(50));


        for(Payable payable : payableObjects){
            System.out.printf(" %s%n %s $%,.2f%n %s%n  ",payable.toString(),"Payment Due: ",payable.getPaymentAmount(),"=".repeat(50) );
        }
    }
}
