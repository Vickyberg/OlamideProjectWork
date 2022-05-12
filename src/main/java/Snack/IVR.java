package Snack;

import java.util.Scanner;

public class IVR {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter 1 for English\n" +
                "Enter 2 for Igbo \n" +
                "Enter 3 for French\n" +
                "Enter 4 for Yoruba \n");
        int command = input.nextInt();

     if(command == 1){
         System.out.println("Enter 1 for Data \n" +
                 "Enter 2 for Transfer\n");
         int usage = input.nextInt();
         if(usage == 1){
             System.out.println("Data");
         }else{
             System.out.println("Transfer");
         }


     }else if(command == 2){
         System.out.println("Enter 1 for Sharing\n" +
                 "Enter 2 for Caring \n");
         int attitude = input.nextInt();
         if(attitude == 1){
             System.out.println("Sharing");
         }else {
             System.out.println("Caring");
         }


     }else if(command == 3) {
         System.out.println("Enter 1 for Egg\n" +
                 "Enter 2 for Champagne\n");
         int substance = input.nextInt();
         if(substance == 1){
             System.out.println("Egg");
         }else {
             System.out.println("Champagne");
         }


        }else if(command == 4){
         System.out.println("Enter 1 for Ewa\n" +
                 "Enter 1 for Agoyin\n");
         int food = input.nextInt();
         if(food == 1 ){
             System.out.println("Ewa");
         }else {
             System.out.println("Ago-yin");
         }
     }
    }
}
