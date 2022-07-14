package ChapterTen;
// Salaried concrete class that extends abstract class Employee

import ChapterEight.Composition.Date;

public class SalariedEmployee extends Employee {
    private  double weeklySalary;


    public SalariedEmployee(String firstName, String secondName, String socialSecurityNumber, Date date, double weeklySalary) {
        super(firstName, secondName, socialSecurityNumber,date);

        if(weeklySalary < 0.0){
            throw new IllegalArgumentException("Weekly salary must be >= 0.0");
        }
        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        if(weeklySalary < 0.0){
            throw new IllegalArgumentException("Weekly salary must be >= 0.0");
        }
        this.weeklySalary = weeklySalary;
    }


    @Override
    public Date getDate() {
        return new Date(7,7,2022);
    }

    @Override
    public double earnings() {
        return getWeeklySalary();
    }
    @Override
    public String toString(){
        return  String.format("%s%n %s%n%s $%,.2f%n ","Salaried Employee",super.toString(),"Weekly Salary >> ",getWeeklySalary());
    }
}
