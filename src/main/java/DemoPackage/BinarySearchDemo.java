package DemoPackage;

import java.util.Arrays;

/*
sort the array
Get the length of the array
Check if the array is even or odd
We get the middle element
If the key is less than the mid-number ,we work with the LHS
if the Key is greater than the mid-number , We work with the RHS
If the key is equal to the mid-number , then SUCCESS :-)

 */

public class BinarySearchDemo {
    public static void main(String[] args) {
        int[] numbers = {23, 45, 1, 0, 89, 3, 8, 90, 190};
        Arrays.sort(numbers);
        displayArray(numbers);

        int key = 90;
        searchNumber(numbers,key);


    }


    private static void displayArray(int[] numbers) {
        for (int i : numbers) {
            System.out.print(i + ",");
        }
    }

    private static void searchNumber(int arrays[], int key) {

        int index = arrays.length / 2;
        int foundNumber = arrays[index];
;
        if (key < arrays[index]) {
            for (int i = 0; i < index; i++) {
                if (key == arrays[i]) {
                    System.out.printf("%nKey %d found at index %d",key, i);
                }
            }
        } else if (key > arrays[index]){
            for (int j = index; j < arrays.length ; j++) {
                if (key == arrays[j]){
                    System.out.printf("%nKey %d found at index %d ", key, j);
            }
            }
        }


    }

}
