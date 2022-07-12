package ChapterTen;

public class PolymorphismTest {
    public static void main(String[] args) {
        CommissionEmployee commissionEmployee = new CommissionEmployee("Jane", "Sarah","333-442-332",10000,0.06);
        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Bob",
                "Victor","555-643-234",5000,0.05,400);
        System.out.println("=".repeat(75));
        System.out.printf("%s %s%n%s%n%n%s%n%n","Call CommissionEmployee's toString with superclass reference",
                "to superclass object","=".repeat(75),commissionEmployee.toString());
        System.out.println("=".repeat(75));

        System.out.printf("%s %s%n%s%n%n%s%n%n",
                "Call BasePlusCommissionEmployee's toString with subclass",
                "reference to subclass object","=".repeat(75),basePlusCommissionEmployee.toString());
        System.out.println("=".repeat(75));


        // invoke toString on subclass object using superclass variable
        CommissionEmployee commissionEmployee2 = basePlusCommissionEmployee;

        System.out.printf("%s %s%n%s%n%n%s%n",
                 "Call BasePlusCommissionEmployee's toString with superclass",
                 "reference to subclass object","=".repeat(75),commissionEmployee2.toString());
    }
}
