package ChapterSeven.CreatingAndManipulationOfArray;

public class IntArray {
    public static void main(String[] args) {
        int [] array = new int[10];

        System.out.printf("%s%8s%n","Index","Value");
        for (int i = 0; i < array.length; i++){
            System.out.printf("%4d%6d%n",i,array[i]);

        }
    }
}
