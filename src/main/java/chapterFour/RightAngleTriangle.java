package chapterFour;

import java.util.Scanner;

public class RightAngleTriangle {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        System.out.print("input number of rows :");
        int rows = t.nextInt();



        for(int i=1; i<= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println("");
        }
        }
    }

