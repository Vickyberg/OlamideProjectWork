package ChapterTen;
//Employee class which is an abstract superclass

import ChapterEight.Composition.Date;

public abstract class Employee {
    private  final String firstName;
    private  final String secondName;
    private final String socialSecurityNumber;
    private final Date date;

    public Employee(String firstName, String secondName, String socialSecurityNumber, Date date) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.date = date;
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
    // abstract method without implementation


    public abstract Date getDate();


    public abstract double earnings();

    @Override
    public String toString(){
        return String.format("%s%s %s%n %s%s%n %s%s%n","Name >> ",getFirstName(),getSecondName(),"Social Security number >> ",getSocialSecurityNumber(),"Birth Date >> ",getDate());
    }
}
