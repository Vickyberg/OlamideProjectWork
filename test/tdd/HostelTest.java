package tdd;

public class HostelTest {
    public static void main(String[] args) {

        Hostel anything = new Hostel();

        anything.setName("Charles");
        anything.setLocation("Ikeja");
        anything.setAge(20);

        int x = anything.getAge() + 15;

        String hisName = anything.getName();
        String hisLocation = anything.getLocation();
        int hisAge = anything.getAge();

        System.out.println("My name is "+ hisName+" and I came from "+ hisLocation+ " and I am " + x + " years old.");
    }
}
