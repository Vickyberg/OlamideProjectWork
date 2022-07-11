package ChapterNine;

public class ExtendedBasePlusCommission  extends CommissionEmployeeWithProtected {
    private double baseSalary;
    public ExtendedBasePlusCommission(String firstName, String secondName,
                                      String socialSecurityNumber, double grossSales, double commissionRate,double baseSalary) {

        super(firstName, secondName, socialSecurityNumber, grossSales, commissionRate);
        if(baseSalary < 0.0){
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        }
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if(baseSalary < 0.0){
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        }
        this.baseSalary = baseSalary;
    }
    public  double earnings(){
        return baseSalary + (grossSales + commissionRate);
    }

    @Override
    public String toString(){
        return String.format("%s: %s %s%n %s: %s%n %s: %.2f%n %s: %.2f%n %s: %.2f%n  ","Base Commission Employee",firstName,secondName,"Social security number: ",
                socialSecurityNumber,"Gross sales: ",grossSales,"Commission rate",commissionRate,"Base salary",baseSalary);
    }

}
