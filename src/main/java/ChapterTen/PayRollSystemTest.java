package ChapterTen;

import ChapterEight.Composition.Date;

public class PayRollSystemTest {
    public static void main(String[] args) {
        SalariedEmployee salariedEmployee = new SalariedEmployee("John",
                "Doe","234-342-452", new Date(2,3,2022),200);

        HourlyEmployee hourlyEmployee = new HourlyEmployee("Charles", "Darwin",
                "345-653-456",new Date(3,7,2022),16.75,40);

        CommissionEmployeePay commissionEmployeePay = new CommissionEmployeePay("Jane","Doe",
                "456-432-456",new Date(7,7,2022),2000,0.04);

        BasePlusCommissionEmployeePay basePlusCommissionEmployeePay = new BasePlusCommissionEmployeePay("Victor",
                "Obama","477-300-081",new Date(7,7,2022),1000,0.06,300);

        System.out.println("=".repeat(75));
        System.out.println("EMPLOYEE PROCESSED INDIVIDUALLY");
        System.out.println("=".repeat(75));

        System.out.printf("%n%s%n%s: $%,.2f%n%n", salariedEmployee, "earned", salariedEmployee.earnings());
        System.out.println("=".repeat(75));

        System.out.printf("%s%n%s: $%,.2f%n%n",  hourlyEmployee, "earned", hourlyEmployee.earnings());
        System.out.println("=".repeat(75));

        System.out.printf("%s%n%s: $%,.2f%n%n",commissionEmployeePay, "earned", commissionEmployeePay.earnings());
        System.out.println("=".repeat(75));

        System.out.printf("%s%n%s: $%,.2f%n%n", basePlusCommissionEmployeePay, "earned", basePlusCommissionEmployeePay.earnings());
        System.out.println("=".repeat(75));

        Employee[] employees = new Employee [4];
        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = commissionEmployeePay;
        employees[3] = basePlusCommissionEmployeePay;

        System.out.printf("EMPLOYEE PROCESSED POLYMORPHICALLY %n");
        System.out.println("=".repeat(75));

        for (Employee currentEmployee : employees){
            System.out.println(currentEmployee);


            if(currentEmployee instanceof BasePlusCommissionEmployeePay){
                BasePlusCommissionEmployeePay employeePay = (BasePlusCommissionEmployeePay) currentEmployee;

                employeePay.setBaseSalary(1.10 * employeePay.getBaseSalary());
                System.out.println("=".repeat(75));
                System.out.printf("New Base salary with 10%% increase is: $%,.2f%n",employeePay.getBaseSalary());
            }



            System.out.printf("Earned $%,.2f%n",currentEmployee.earnings());
            System.out.println("=".repeat(75));
        }
        for (Employee employee: employees){
            if(employee.getDate().getMonth() == 7 ){
                System.out.printf("%s%n %n%s%n %s $%s%n",employee.toString(),"This is a bonus to celebrate your birthday!!","Earned >> ",employee.earnings() + 100);
                System.out.println("=".repeat(75));
            }
        }

        for (int j = 0; j < employees.length; j++) {
            System.out.printf("Employee %d is a %s%n", j,
                    employees[j].getClass().getName());
            System.out.println("=".repeat(75));
        }



    }

}
