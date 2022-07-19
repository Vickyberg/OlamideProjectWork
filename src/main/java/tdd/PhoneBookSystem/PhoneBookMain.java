package tdd.PhoneBookSystem;

import java.util.Objects;
import java.util.Scanner;

public class PhoneBookMain {
    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        PhoneBook myPhoneBook = new PhoneBook("Contact PhoneBook");

        System.out.println("=".repeat(50));
        System.out.printf("%35s%n","WELCOME TO YOUR PHONEBOOK");
        System.out.println("=".repeat(50));
        mainMenu();
        System.out.println("=".repeat(50));

        int userResponse = userInput.nextInt();
        while (userResponse != -1) {

            switch (userResponse) {
                case 1:
                    createContact();
                    break;


            }
        }

    }

    private static void createContact() {
        String response ;

        System.out.println("Create Contact");
        System.out.printf("Enter First Name%n%s",">>> ");
        userInput.nextLine();
        userInput.nextLine();
        System.out.printf("Enter Second Name%n%s",">>> ");
        userInput.nextLine();
        System.out.printf("Enter Address%n%s",">>> ");
        userInput.nextLine();
        System.out.printf("Enter Phone Number%n%s",">>> ");
        userInput.nextLine();
        System.out.printf("Enter Email%n%s",">>> ");
        userInput.nextLine();
        System.out.println("Add More Contact?");
        response = userInput.nextLine();
        if(Objects.equals(response, "Yes")){
            createContact();

        }else
            mainMenu();



    }
    private  static void mainMenu(){
        System.out.println("""
                1: Create Contact
                2: View Contacts In PhoneBook
                3: Delete Contact
                4: Exit
                """);
    }
}