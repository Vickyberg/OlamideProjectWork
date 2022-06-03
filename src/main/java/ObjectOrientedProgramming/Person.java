package ObjectOrientedProgramming;

public class Person {
    private String name;
    private int age;
    private Gender gender;
    private MaritalStatus maritalStatus;

    public Person(String name, int age, Gender gender, MaritalStatus maritalStatus) {
        System.out.println("The name is " + name + "\n" + "The age is " + age + "\n" + "Gender is " +Gender.Male +"\n" + "The Marital status is " + MaritalStatus.Married);
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
    }
}
