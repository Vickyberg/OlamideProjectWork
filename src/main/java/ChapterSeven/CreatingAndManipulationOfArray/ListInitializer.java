package ChapterSeven.CreatingAndManipulationOfArray;

public class ListInitializer {
    public static void main(String[] args) {
        int[] array = {34,55,21,44,53,54,63,14,66,23};

        System.out.printf("%s%6s%n","Index","Value");
        for (int i = 0; i < array.length; i++) {

            System.out.printf("%4d%5d%n",i,array[i]);

        }
    }
}
