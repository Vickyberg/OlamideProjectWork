package ChapterTen;
//Employee class which is an abstract superclass

public abstract class Employee {
    private  final String firstName;
    private  final String secondName;
    private final String socialSecurityNumber;

    public Employee(String firstName, String secondName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.socialSecurityNumber = socialSecurityNumber;
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
    public abstract double earnings();

    @Override
    public String toString(){
        return String.format("%s%s %s%n %s%s","Name >> ",getFirstName(),getSecondName(),"Social Security number >> ",getSocialSecurityNumber());
    }
}
