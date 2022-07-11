package ChapterNine;

public class CommissionEmployeeWithProtected {
    protected   final String firstName;
    protected   final String secondName;
    protected final String socialSecurityNumber;
    protected double grossSales;
    protected double commissionRate;


    public CommissionEmployeeWithProtected(String firstName, String secondName, String socialSecurityNumber, double grossSales, double commissionRate) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;

    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        if(grossSales < 0.0){
            throw  new IllegalArgumentException("Gross sales must be greater than 0.0");
        }
        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }


    public void setCommissionRate(double commissionRate) {
        if(commissionRate < 0.0 || commissionRate > 1.0){
            throw new IllegalArgumentException("commission rate must be > 0.0 and < 1.0");
        }
        this.commissionRate = commissionRate;
    }

    public double earnings(){
        return  grossSales * commissionRate;
    }

    @Override
    public String toString(){
        return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f","Commission employee",
                firstName,secondName, "Social Security Number",
                socialSecurityNumber,"Gross sales",grossSales,"Commission rate",commissionRate);
    }
}
