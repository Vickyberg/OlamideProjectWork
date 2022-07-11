package ChapterNine;

public class BaseCommissionEmployeeTest {
    public static void main(String[] args) {
        BasePlusCommissionEmployee commissionEmployee = new BasePlusCommissionEmployee("Victor","Olamide",
                "223-343-244",1000.0,0.06,500);

        System.out.println("*".repeat(65));
        System.out.println("Base Employee Details obtained by get methods in Commission Employee  class");
        System.out.println("*".repeat(65));
        System.out.printf("%n%s %s%n","The First  name >>>",commissionEmployee.getFirstName());
        System.out.printf("%s %s%n","The Last name >>>",commissionEmployee.getSecondName());
        System.out.printf("%s %s%n ","The social security number >>>",commissionEmployee.getSocialSecurityNumber());
        System.out.printf("%s %.2f%n","The gross sales >>>",commissionEmployee.getGrossSales());
        System.out.printf("%s %.2f%n ","Commission rate >>>", commissionEmployee.getCommissionRate());
        System.out.printf("%s %.2f%n%n","Base salary >>>", commissionEmployee.getBaseSalary());

        commissionEmployee.setBaseSalary(2000);

        System.out.println("*".repeat(65));


        System.out.printf("%s%n%s %n%n%s%n","Update obtained from to string method in class commission employee ","*".repeat(65),commissionEmployee);
    }
}
