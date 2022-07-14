package ChapterSeven.CreatingAndManipulationOfArray;

public class StoringCalculatedValueInArray {
    public static void main(String[] args) {
          final int ARRAY_LENGTH = 10;
        int [] array = new int[ARRAY_LENGTH];

        System.out.printf("%s%6s%n","Index","Value");

        for (int i = 0; i < array.length; i++) {
            array[i] =  2 +  2 * i;
            System.out.printf("%4d%5d%n",i,array[i]);

        }
    }
}
