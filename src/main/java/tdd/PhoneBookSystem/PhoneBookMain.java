package tdd.PhoneBookSystem;

import java.util.Objects;
import java.util.Scanner;

public class PhoneBookMain {
    static Scanner userInput = new Scanner(System.in);


    public static void main(String[] args) {
        System.out.println("Enter PhoneBook Type");
        String phoneBook = userInput.nextLine();
        PhoneBook myPhoneBook = new PhoneBook(phoneBook);


        System.out.println("=".repeat(50));
        System.out.printf("%20s %s %s%n","WELCOME TO",phoneBook.toUpperCase(),"PHONEBOOK");
        System.out.println("=".repeat(50));
        mainMenu();
        System.out.println("=".repeat(50));

        int userResponse = userInput.nextInt();
        while (userResponse != -1) {

            switch (userResponse) {
                case 1 -> {

                        createContact();
                        userResponse = userInput.nextInt();


                }
                case 2 -> {
                    viewContacts();
                    userResponse = userInput.nextInt();
                }

                case 3 -> {
                    deleteContact();
                    userResponse = userInput.nextInt();
                }
                case 4 -> {
                    editContact();
                    userResponse = userInput.nextInt();
                }
            }
        }

    }

    private static void editContact() {


    }

    private static void deleteContact() {
    }

    private static void viewContacts() {



    }

    private static void createContact() {
        String response ;

        System.out.println("REGISTER");
        System.out.printf("Enter First Name%n%s",">>> ");
        String firstName = userInput.nextLine();
        userInput.nextLine();
        System.out.printf("Enter Second Name%n%s",">>> ");
        String secondName = userInput.nextLine();
        System.out.printf("Enter Address%n%s",">>> ");
        String address = userInput.nextLine();
        System.out.printf("Enter Phone Number%n%s",">>> ");
        String phoneNumber =userInput.nextLine();
        System.out.printf("Enter Email%n%s",">>> ");
        String email = userInput.nextLine();
        System.out.println("Add More Contact?");
        response = userInput.nextLine();
        if(Objects.equals(response, "yes")){

            createContact();

        }else {
         mainMenu();
         userInput.nextInt();

        }






    }
    private  static void mainMenu(){
        System.out.println("""
                1: Register
                2: View Contacts
                3: Edit Contact
                4: Delete Contact
                5: Exit
                """);
    }
}