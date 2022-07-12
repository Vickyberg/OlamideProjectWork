package ChapterTen;

public class BasePlusCommissionEmployeePay extends  CommissionEmployeePay{
    private double baseSalary;
    public BasePlusCommissionEmployeePay(String firstName, String secondName, String socialSecurityNumber,
                                     double grossSales, double commissionRate,double baseSalary) {
        super(firstName, secondName, socialSecurityNumber, grossSales, commissionRate);

        if(baseSalary < 0.0){
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        }
        this.baseSalary  = baseSalary;
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

    @Override
    public double earnings(){
        return  getBaseSalary() + super.earnings();
    }

    @Override
    public String toString(){
        return  String.format("%s%n %s%n %s%.2f%n","Base Salaried Employee: ",super.toString(),"Base salary >>",getBaseSalary());
    }
}
