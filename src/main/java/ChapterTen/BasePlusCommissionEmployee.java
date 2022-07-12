package ChapterTen;

import ChapterTen.CommissionEmployee;

public class BasePlusCommissionEmployee extends CommissionEmployee {
    private  final String firstName;
    private  final String secondName;
    private final String socialSecurityNumber;
    private double grossSales;
    private double commissionRate;
    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String secondName, String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary) {
        super(firstName, secondName, socialSecurityNumber, grossSales, commissionRate);
        this.firstName = firstName;
        this.secondName = secondName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
        this.baseSalary = baseSalary;
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
        if(grossSales < 0){
            throw new RuntimeException("Gross sales must must be > 0");
        }
        this.grossSales = grossSales;

    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        if(commissionRate < 0.0 || commissionRate > 1.0){
            throw new IllegalArgumentException("Commission must must be > 0.0 and < 1.0");
        }
        this.commissionRate = commissionRate;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if(baseSalary < 0){
            throw new IllegalArgumentException("Base salaries must must be > 0");
        }
        this.baseSalary = baseSalary;
    }
    public  double earnings(){
        return getBaseSalary() + super.earnings();
    }
    @Override
    public  String toString(){
        return String.format("%s %s%n%s: %.2f","Base salaried",super.toString(),"Base Salary",getBaseSalary());
    }

}
