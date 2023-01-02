package Chapter16;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort2 {
    public static void main(String[] args) {
        String[] suits = {"Heart", "Diamonds", "Clubs","Spades"};

        List<String> list = Arrays.asList(suits);
        System.out.printf("Unsorted Arrays : %s%n", list );

        Collections.sort(list,Collections.reverseOrder());

        System.out.printf("Sorted Array in reversed order: %s%n",list);

    }
}
