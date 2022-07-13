package ChapterTen.Interface;
// Salaried concrete class that extends abstract class Employee


public class SalariedEmployee extends Employee {
    private  double weeklySalary;

    public SalariedEmployee(String firstName, String secondName, String socialSecurityNumber, double weeklySalary) {
        super(firstName, secondName, socialSecurityNumber);

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
    public double earnings() {
        return getWeeklySalary();
    }
    @Override
    public String toString(){
        return  String.format("%s%n %s%n%s $%,.2f","Salaried Employee",super.toString(),"Weekly Salary >> ",getWeeklySalary());
    }
}
