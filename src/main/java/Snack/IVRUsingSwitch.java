package Snack;

import java.util.Scanner;

public class IVRUsingSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1 for English\n" +
                "Enter 2 for igbo\n" +
                "Enter 3 for French\n" +
                "Enter 4 for Yoruba\n");
        int command = input.nextInt();
        switch (command) {
            case 1:
                System.out.println("Enter 1 for Data\n" +
                        "Enter 2 for Transfer\n");
                int internet = input.nextInt();
                switch(internet ){
                    case 1: System.out.println("Data");
                    break;
                    case 2: System.out.println("Transfer");
                    break;
                }

                break;
            case 2:
                System.out.println("Enter 1 for Sharing\n" +
                        "Enter 2 for Caring");
                int attitude = input.nextInt();
                switch (attitude) {
                    case 1: System.out.println("Sharing");
                    break;
                    case 2: System.out.println("Caring");
                    break;

                }
                break;
            case 3:
                System.out.println("Enter 1 for Egg\n" +
                        "Enter 2 for Champagne\n");
                int drink = input.nextInt();
                switch (drink){
                    case 1: System.out.println("Egg");
                    break;
                    case 2: System.out.println("Champagne");
                    break;

                }
                break;
            case 4:
                System.out.println("Enter 1 for Ewa\n" +
                        "Enter 2 for Agoyin\n");
                int food = input.nextInt();
                switch (food){
                    case 1: System.out.println("Ewa");
                    break;
                    case 2: System.out.println("Agoyin");
                    break;
                }
                break;
            default:
                System.out.println("ERROR!!!");
                break;


        }
    }

    }

