package ChapterSeven;
import java.util.ArrayList;
import  java.util.List;

public class WorkingWithArrayList {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<String>();

        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Green");

        System.out.println(colors);
        System.out.println(colors.size());
        System.out.println(colors.contains("Yellow"));
        System.out.println(colors.contains("Purple"));

    }
}
