package ObjectOrientedProgramming;

public class Native extends Person{
    private Cohort cohort;
    public Native(String name, int age, Gender gender, MaritalStatus maritalStatus,Cohort cohort){
        //passing back to the super class
        super(name, age, gender, maritalStatus);
    }
}
