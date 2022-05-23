package ChapterSeven;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] myArray = {10,20,33,6,-7};

        int total = 0;
        int average = 0;
        int largest = 0;
        int smallest = myArray[0];
        for(int i =0 ; i < myArray.length;i++){
            total += myArray[i];
            average = total / myArray.length ;
            if(largest < myArray[i]){
                largest = myArray[i];
            } else if (smallest > myArray[i]) {
                smallest = myArray[i];
            }
        }
        System.out.println(Arrays.toString(myArray));
        System.out.println("The total is " +total);
        System.out.println("Average is " + average);
        System.out.println("The largest is " + largest);
        System.out.println("The smallest is " + smallest);



    }

}
