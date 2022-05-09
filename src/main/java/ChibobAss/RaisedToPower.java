package ChibobAss;

import java.util.Scanner;

public class RaisedToPower {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter First number: ");
        int num1 = input.nextInt();
        System.out.print("Enter Second Number: ");
        int num2 = input.nextInt();
        int power1 = 1;
        int power2 = 1;
        if(num2 > 1) {
            for ( int i =1 ; i <= num2; i++){
                power1 = (int) Math.pow(num1,num2);
            }
            System.out.println("First number is raised to second number which is equal to: " +power1);
        }
        if(num1 > 1){
            for(int i =1 ; i<= num1; i++){
                power2 = (int) Math.pow(num2,num1);
            }
            System.out.println("Second number is raised to first number which is equal to: " +power2);
        }
    }
}
