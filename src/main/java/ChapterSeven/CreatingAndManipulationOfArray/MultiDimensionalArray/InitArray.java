package ChapterSeven.CreatingAndManipulationOfArray.MultiDimensionalArray;

public class InitArray {
    public static void main(String[] args) {
        int[][] array1 = {{1, 2, 3}, {4, 5, 6}};
        int[][] array2 = {{1, 2}, {3}, {4, 5, 6}};

        System.out.println("The values in array1 by row");
        outPutArray(array1);
        System.out.println("The values in array2 by column");
        outPutArray(array2);


    }
    public static void outPutArray(int [][] array){
        int total = 0;
        for (int row = 0; row < array.length; row++) {
            for(int column = 0; column < array[row].length; column++){
                System.out.printf("%d ",array[row][column]);
            }
            System.out.println();

        }
    }
}
