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
                System.out.printf("%02d - %02d: ", counter * 10, counter * 10 + 9);
            }
            for (int star = 0; star < arrays[counter]; star++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
