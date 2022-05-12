package Snack;

import java.util.Scanner;

public class IVR {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("""
                Enter 1 for English
                Enter 2 for Igbo
                Enter 3 for French
                Enter 4 for Yoruba
                """);
        int command = input.nextInt();

     if(command == 1){
         System.out.println("""
                 Enter 1 for Data
                 Enter 2 for Transfer
                 """);
         int usage = input.nextInt();
         if(usage == 1){
             System.out.println("Data");
         }else{
             System.out.println("Transfer");
         }


     }else if(command == 2){
         System.out.println("""
                 Enter 1 for Sharing
                 Enter 2 for Caring
                 """);
         int attitude = input.nextInt();
         if(attitude == 1){
             System.out.println("Sharing");
         }else {
             System.out.println("Caring");
         }


     }else if(command == 3) {
         System.out.println("""
                 Enter 1 for Egg
                 Enter 2 for Champagne
                 """);
         int substance = input.nextInt();
         if(substance == 1){
             System.out.println("Egg");
         }else {
             System.out.println("Champagne");
         }


        }else if(command == 4){
         System.out.println("""
                 Enter 1 for Ewa
                 Enter 2 for Agoyin
                 """);
         int food = input.nextInt();
         if(food == 1 ){
             System.out.println("Ewa");
         }else {
             System.out.println("Ago-yin");
         }
     }
    }
}
