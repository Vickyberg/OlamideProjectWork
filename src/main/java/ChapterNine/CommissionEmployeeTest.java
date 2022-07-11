package ChapterNine;

public class CommissionEmployeeTest {
    public static void main(String[] args) {
        CommissionEmployee employee = new CommissionEmployee("Victor","Olamide",
                "234-342-134",1000,0.6);
        System.out.println("=".repeat(65));
        System.out.println("Employee Details obtained by get methods in Commission Employee class");
        System.out.println("=".repeat(65));
        System.out.printf("%n%s %s%n","The First name >>>",employee.getFirstName());
        System.out.printf("%s %s%n","The Last name >>>",employee.getSecondName());
        System.out.printf("%s %s%n ","The social security number >>>",employee.getSocialSecurityNumber());
        System.out.printf("%s %.2f%n","The gross sales >>>",employee.getGrossSales());
        System.out.printf("%s %.2f%n%n ","Commission rate >>>", employee.getCommissionRate());

        employee.setGrossSales(2000);
        employee.setCommissionRate(0.1);
        System.out.println("=".repeat(65));


        System.out.printf("%s%n%s %n%n%s%n","Update obtained from to string method in class commission employee ","=".repeat(65),employee);

    }
}
