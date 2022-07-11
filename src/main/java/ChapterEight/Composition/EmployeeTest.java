package ChapterEight.Composition;

public class EmployeeTest {
    public static void main(String[] args) {
        Date birth = new Date(7,7,1997);
        Date hire =  new Date(7,11,2022);
        Employee employee = new Employee("Olamide", "Victor",birth,hire);

        System.out.println(employee );
    }
}
