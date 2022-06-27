package ChapterSeven;

public class BarChart {
    public static void main(String[] args) {
        int[] arrays = {0, 0, 0, 0, 0, 0, 1, 2, 4, 2, 1};
        int counter = 0;

        System.out.println("Grade Distribution");
        for (counter = 0; counter < arrays.length; counter++) {

            if (counter == 10) {
                System.out.printf("%5d:   ", 100);
            }else {
                int firstRange = counter * 10;
                int secondRange = counter * 10 + 9;
                System.out.printf("%02d - %02d: ", firstRange, secondRange);
            }
            for (int star = 0; star < arrays[counter]; star++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
