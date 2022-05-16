package ChibobTwo;



import java.util.Scanner;

public class IVRUsingSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("""
                Enter 1 for English
                Enter 2 for Igbo
                Enter 3 for French
                Enter 4 for Yoruba
                """);
        int userResponse = input.nextInt();
        switch (userResponse) {
            case 1 -> {
                System.out.println("""
                        Enter 1 for Data
                        Enter 2 for Transfer
                        """);
                 userResponse = input.nextInt();
                switch (userResponse) {
                    case 1 -> System.out.println("Data");
                    case 2 -> System.out.println("Transfer");
                }
            }
            case 2 -> {
                System.out.println("""
                        Enter 1 for Sharing
                        Enter 2 for Caring""");
                userResponse= input.nextInt();
                switch (userResponse) {
                    case 1 -> System.out.println("Sharing");
                    case 2 -> System.out.println("Caring");
                }
            }
            case 3 -> {
                System.out.println("""
                        Enter 1 for Egg
                        Enter 2 for Champagne
                        """);
                 userResponse = input.nextInt();
                switch (userResponse) {
                    case 1 -> System.out.println("Egg");
                    case 2 -> System.out.println("Champagne");
                }
            }
            case 4 -> {
                System.out.println("""
                        Enter 1 for Ewa
                        Enter 2 for Agoyin
                        """);
                userResponse = input.nextInt();
                switch (userResponse ) {
                    case 1 -> System.out.println("Ewa");
                    case 2 -> System.out.println("Agoyin");
                }
            }
            default -> System.out.println("ERROR!!!");
        }
    }

    }

