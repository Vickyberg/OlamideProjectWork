package ChapterNine.Exercise;

import ChapterNine.CommissionEmployee;

public class CommissionEmployeeTest {
    public static void main(String[] args) {
        CommissionEmployee commissionEmployee = new CommissionEmployee("John","Doe",
                "222-334-154",3000,0.4);
        System.out.println("+".repeat(65));
        System.out.println("Employee Details obtained by get methods in Employee class");
        System.out.println("+".repeat(65));
        System.out.printf("%n%s %s%n","The First name >>>",commissionEmployee.getFirstName());
        System.out.printf("%s %s%n","The Last name >>>",commissionEmployee.getSecondName());
        System.out.printf("%s %s%n ","The social security number >>>",commissionEmployee.getSocialSecurityNumber());


        commissionEmployee.setGrossSales(7000);
        commissionEmployee.setCommissionRate(0.9);
        System.out.println("+".repeat(65));


        System.out.printf("%s%n%s %n%n%s%n","Update obtained from to string method in class commission employee ","+".repeat(65),commissionEmployee);
    }
}
