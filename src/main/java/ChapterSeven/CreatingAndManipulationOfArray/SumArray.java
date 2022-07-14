package ChapterSeven.CreatingAndManipulationOfArray;

public class SumArray {
    public static void main(String[] args) {
        int total = 0;
        int [] array = {23,5,64,32,6,34,64};

        for (int i = 0; i < array.length; i++) {
            total += array[i];

        }
        System.out.printf("The sum of the elements in the array: " + total);


    }
}
