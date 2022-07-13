package ChapterTen.Interface;

public abstract class Employee implements Payable{
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

    public abstract double earnings();

    @Override
    public double getPaymentAmount() {
        return earnings() ;
    }

    @Override
    public String toString(){
        return String.format("%s %s%n %s%s%n",getFirstName(),getSecondName(),"Social Security Number: ",getSocialSecurityNumber());
    }
}
