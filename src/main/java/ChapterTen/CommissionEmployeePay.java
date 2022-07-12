package ChapterTen;

public class CommissionEmployeePay extends Employee {
    private double grossSales;
    private double commissionRate;
    public CommissionEmployeePay(String firstName, String secondName, String socialSecurityNumber,double grossSales,double commissionRate) {
        super(firstName, secondName, socialSecurityNumber);

        if(grossSales < 0.0){
            throw new IllegalArgumentException("Gross sales must be >= 0.0");

        }
        this.grossSales = grossSales;

        if(commissionRate < 0.0 || commissionRate > 1.0){
            throw new IllegalArgumentException("Commission rate must >= 0.0 and <= 1.0");
        }
        this.commissionRate = commissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        if(grossSales < 0.0){
            throw new IllegalArgumentException("Gross sales must be >= 0.0");

        }
        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {

        if(commissionRate < 0.0 || commissionRate > 1.0){
            throw new IllegalArgumentException("Commission rate must >= 0.0 and <= 1.0");
        }
        this.commissionRate = commissionRate;
    }

    @Override
    public double earnings() {
        return getGrossSales() *  getCommissionRate();
    }

    @Override
    public  String toString(){
        return String.format("%s%n %s%n %s%.2f%n %s%.2f%n","Commission Employee: ",
                super.toString(),"Gross sale >> ", getGrossSales(),"Commission Rate >> ", getCommissionRate());
    }
}
