package ChapterTen;

import ChapterEight.Composition.Date;


public class HourlyEmployee extends Employee {
    private double wage; //wage per hour
    private double hours; //hours in a week
    public HourlyEmployee(String firstName, String secondName, String socialSecurityNumber, Date date, double wage, double hours) {
        super(firstName, secondName, socialSecurityNumber,date);

        if(hours < 0.0 || hours > 168.0){
            throw new IllegalArgumentException("Hours must be >= 0.0 and <= 168.0");

        }
        this.hours = hours;
        if(wage < 0.0){
            throw new IllegalArgumentException("Wage must >= 0.0");
        }
        this.wage = wage;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        if(wage < 0.0){
            throw new IllegalArgumentException("Wage must >= 0.0");
        }
        this.wage = wage;
    }

    public double getHours() {
        return hours;
    }


    public void setHours(double hours) {
        if(hours < 0.0 || hours > 168.0){
            throw new IllegalArgumentException("Hours must be >= 0.0 and <= 168.0");

        }
        this.hours = hours;
    }


    @Override
    public Date getDate() {
        return new Date(2,7,2022);
    }

    @Override
    public double earnings() {
        if(getHours() <= 40){
            return getWage() * getHours();
        } else {
            return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
        }
    }

    @Override
    public String toString(){
        return String.format("%s%n %s%n%s $%,.2f%n %s%s hrs%n%n ","Hourly Employee: ",super.toString(),"Wage >> ",getWage(),"Hours Worked >> ",getHours());
    }

}
