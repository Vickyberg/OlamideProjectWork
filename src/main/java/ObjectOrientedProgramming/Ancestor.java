package ObjectOrientedProgramming;

public class Ancestor  extends Native{
    private String workPlace;
    public Ancestor(String name,int age,Gender gender,MaritalStatus maritalStatus,Cohort cohort,String workPlace){
        super(name, age, gender, maritalStatus, cohort);
        System.out.println("Creating ancestor");
        this.workPlace = workPlace;
        System.out.println("Finished creating ancestor");
    }
}
