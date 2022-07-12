package ChapterNine.Exercise;

public class CommissionEmployee extends Employee{
    private double commissionRate;
    private double grossSales;
    public CommissionEmployee(String firstName, String secondName, String socialSecurityNumber,double commissionRate, double grossSales) {
        super(firstName, secondName, socialSecurityNumber);

    }

    public double getCommissionRate() {

        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        if(commissionRate <= 0.0 && commissionRate > 1.0){
            throw new IllegalArgumentException("Commission rate must be > 0.0 and <= 1");
        }
        this.commissionRate = commissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        if(grossSales <= 0.0){
            throw new IllegalArgumentException("Gross sales must be > 0.0 and <= 1");
        }
        this.grossSales = grossSales;
    }

    @Override
    public String toString() {
        return String.format("%s%n %s%s%n %s%s%n %s%s%n %s%s%n %s%s%n","Commission Employee","The first name >>>",getFirstName(),
                "The second name >>>",getSecondName(),"The social security number >>>",
                getSocialSecurityNumber(), "The Gross sale >>>",getGrossSales(),
                "The commission rate >>>",getCommissionRate());
    }
}
