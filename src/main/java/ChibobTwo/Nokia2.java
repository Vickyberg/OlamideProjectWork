package ChibobTwo;

import java.util.Scanner;

public class Nokia2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        mainMenu();


        int userResponse = input.nextInt();
            switch (userResponse) {
                case 1:
                    phoneBookMenu(input);
                    System.out.println("Enter 0 to go back to the main menu");
                    userResponse = input.nextInt();
                    if (userResponse == 0){
                        mainMenu();
                    }
                    break;
                case 2:
                    message(input);
                    System.out.println("Enter 0 to go back to the main menu ");
                    userResponse = input.nextInt();
                    if (userResponse == 0) {
                        mainMenu();
                    }
                    break;
                case 3:
                    System.out.println("Chat");
                    System.out.println("Enter 0 to exit to the main menu");
                    userResponse = input.nextInt();
                    if(userResponse == 0){
                        mainMenu();
                    }
                    break;
                case 4:
                    callRegisterOptions(input);
                    System.out.println("Enter 0 to exit to the main menu");
                    userResponse = input.nextInt();
                    if(userResponse == 0){
                        mainMenu();
                    }
                    break;
                case 5:
                    tonesOptions(input);
                    System.out.println("Enter 0 to go back to the main menu");
                    userResponse = input.nextInt();
                    if (userResponse == 0){
                        mainMenu();
                    }
                    break;
                case 6:

                    settingsOptions(input);
                    System.out.println("Enter 0 to exit to the main menu");
                    userResponse = input.nextInt();
                    if(userResponse == 0){
                        mainMenu();
                    }
                    break;
                case 7:
                    System.out.println("Call divert");
                    System.out.println("Enter 0 to exit to the main menu");
                    userResponse = input.nextInt();
                    if(userResponse == 0){
                        mainMenu();
                    }
                    break;
                case 8:
                    System.out.println("Games");
                    System.out.println("Enter 0 to exit to the main menu");
                    userResponse = input.nextInt();
                    if(userResponse == 0){
                        mainMenu();
                    }
                    break;
                case 9:
                    System.out.println("Calculator");
                    System.out.println("Enter 0 to exit to the main menu");
                    userResponse = input.nextInt();
                    if(userResponse == 0){
                        mainMenu();
                    }
                    break;
                case 10:
                    System.out.println("Reminders");
                    System.out.println("Enter 0 to exit to the main menu");
                    userResponse = input.nextInt();
                    if(userResponse == 0){
                        mainMenu();
                    }
                    break;
                case 11:
                    clockOption(input);
                    System.out.println("Enter 0 to exit to the main menu");
                    userResponse = input.nextInt();
                    if (userResponse == 0){
                        mainMenu();
                    }
                    break;
                case 12:
                    System.out.println("Profiles");
                    System.out.println("Enter 0 to Exit to the Main menu");
                    userResponse = input.nextInt();
                    if(userResponse == 0){
                        mainMenu();
                        break;
                    }

                case 13:
                    System.out.println("Sim services");
                    System.out.println("Enter 0 to Exit to the Main menu");
                    userResponse = input.nextInt();
                    if (userResponse == 0) {
                        mainMenu();
                        break;
                    }


            }


        }

    private static void callRegisterOptions(Scanner input) {
        int userResponse;
        System.out.println("Call register");
        System.out.println("""
                1. Missed calls
                2. Received calls
                3. Dialled numbers
                4. Erase recent call lists
                5. Show call duration
                6. Show call costs
                7. Call cost settings
                8. Prepaid credit 
                9. Exit        
                """);
        userResponse = input.nextInt();
        switch (userResponse) {
            case 1 : System.out.println("Missed calls");
                System.out.println("Enter 0 for previous menu");
                userResponse = input.nextInt();
                while (userResponse == 0){
                   callRegisterOptions(input);
                }
            break;
            case 2 : System.out.println("Received calls");
                System.out.println("Enter 0 for previous menu");
                userResponse = input.nextInt();
                while (userResponse == 0){
                    callRegisterOptions(input);
                }
            break;
            case 3 : System.out.println("Dialled numbers");
                System.out.println("Enter 0 for previous menu");
                userResponse = input.nextInt();
                while (userResponse == 0){
                    callRegisterOptions(input);
                }
            break;
            case 4 : System.out.println("Erase recent call lists");
                System.out.println("Enter 0 for previous menu");
                userResponse = input.nextInt();
                while (userResponse == 0){
                    callRegisterOptions(input);
                }
            break;
            case 5 :
                callDurationOption(input);
                System.out.println("Enter 0 for previous menu");
                userResponse = input.nextInt();
                while (userResponse == 0){
                    callRegisterOptions(input);
                }
                break;
            case 6 :
                callCostOptions(input);
                System.out.println("Enter 0 for previous menu");
                userResponse = input.nextInt();
                while (userResponse == 0){
                    callRegisterOptions(input);
                }
                break;
            case 7 :
                callCostSettingOptions(input);
                System.out.println("Enter 0 for previous menu");
                userResponse = input.nextInt();
                while (userResponse == 0){
                    callRegisterOptions(input);
                }
                break;
            case 8 : System.out.println("Prepaid credit");
                System.out.println("Enter 0 for previous menu");
                userResponse = input.nextInt();
                while (userResponse == 0){
                    callRegisterOptions(input);
                }
            break;
        }

    }


    private static void callCostSettingOptions(Scanner input) {
        int userResponse;
        System.out.println("Call cost settings");
        System.out.println("""
                1.Call cost limit
                2.Show costs in 
                3.Back
                """);
        userResponse = input.nextInt();
        switch (userResponse) {
            case 1 : System.out.println("Call cost limit");
                System.out.println("Enter 0 for previous menu");
                userResponse = input.nextInt();
                while (userResponse == 0){
                    callCostSettingOptions(input);
                }
            break;
            case 2 : System.out.println("Show cost in");
                System.out.println("Enter 0 for previous menu");
                userResponse = input.nextInt();
                while (userResponse == 0){
                    callCostSettingOptions(input);
                }
            break;
        }
    }

    private static void callCostOptions(Scanner input) {
        int userResponse;
        System.out.println("Show call costs");
        System.out.println("""
                1. Last call cost
                2. All calls' cost
                3. Clear counters
                4. Back
                """);
        userResponse = input.nextInt();
        switch (userResponse) {
            case 1 : System.out.println("Last call cost");
                System.out.println("Enter 0 for previous menu");
                userResponse = input.nextInt();
                while (userResponse == 0){
                    callCostOptions(input);
                }
            break;
            case 2 : System.out.println("All calls' cost");
                System.out.println("Enter 0 for previous menu");
                userResponse = input.nextInt();
                while (userResponse == 0){
                    callCostOptions(input);
                }
            break;
            case 3 : System.out.println("Clear counters");
                System.out.println("Enter 0 for previous menu");
                userResponse = input.nextInt();
                while (userResponse == 0){
                    callCostOptions(input);
                }
            break;
        }
    }

    private static void callDurationOption(Scanner input) {
        int userResponse;
        System.out.println("Show call duration");
        System.out.println("""
                1.Last call duration
                2.All calls' duration
                3.Received calls' duration
                4.Dialled calls' duration
                5.Clear times 
                6.Back       
                """);
        userResponse = input.nextInt();
        switch (userResponse) {
            case 1 : System.out.println("Last call duration");
            System.out.println("Enter 0 for previous menu");
            userResponse = input.nextInt();
            while (userResponse == 0){
                callDurationOption(input);
            }
            break;
            case 2 : System.out.println("All calls' duration");
                System.out.println("Enter 0 for previous menu");
                userResponse = input.nextInt();
                while (userResponse == 0){
                    callDurationOption(input);
                }
            break;
            case 3 : System.out.println("Received calls' duration");
                System.out.println("Enter 0 for previous menu");
                userResponse = input.nextInt();
                while (userResponse == 0){
                    callDurationOption(input);
                }
            break;
            case 4 : System.out.println("Dialled calls' duration");
                System.out.println("Enter 0 for previous menu");
                userResponse = input.nextInt();
                while (userResponse == 0){
                    callDurationOption(input);
                }
            break;
            case 5 : System.out.println("Clear times");
                System.out.println("Enter 0 for previous menu");
                userResponse = input.nextInt();
                while (userResponse == 0){
                    callDurationOption(input);
                }
            break;
        }
    }

    private static void tonesOptions(Scanner input) {
        System.out.println("Tones");
        System.out.println("""
                            1. Ringing tone
                            2. Ringing volume
                            3. Incoming call alert
                            4. Composer
                            5. Message alert tone
                            6. Keypad tones
                            7. Warning and games tones
                            8. Vibrating alert
                            9. Screen saver
                            10.Exit
                                                
                                    """);
        int userResponse;
        userResponse = input.nextInt();
        switch (userResponse) {
            case 1 : System.out.println("Ringing tones");
            System.out.println("Enter 0 for previous menu");
            userResponse = input.nextInt();
            while(userResponse == 0){
                tonesOptions(input);
            }
            break;
            case 2 : System.out.println("Ringing volume");
                System.out.println("Enter 0 for previous menu");
                userResponse = input.nextInt();
                while(userResponse == 0){
                    tonesOptions(input);
                }
            break;
            case 3 : System.out.println("Incoming call alert");
                System.out.println("Enter 0 for previous menu");
                userResponse = input.nextInt();
                while(userResponse == 0){
                    tonesOptions(input);
                }
            break;
            case 4 : System.out.println("Composer");
                System.out.println("Enter 0 for previous menu");
                userResponse = input.nextInt();
                while(userResponse == 0){
                    tonesOptions(input);
                }
            break;
            case 5 : System.out.println("Message alert tone");
                System.out.println("Enter 0 for previous menu");
                userResponse = input.nextInt();
                while(userResponse == 0){
                    tonesOptions(input);
                }
            break;
            case 6 : System.out.println("Keypad tones");
                System.out.println("Enter 0 for previous menu");
                userResponse = input.nextInt();
                while(userResponse == 0){
                    tonesOptions(input);
                }
            break;
            case 7 : System.out.println("Warning and game tones");
                System.out.println("Enter 0 for previous menu");
                userResponse = input.nextInt();
                while(userResponse == 0){
                    tonesOptions(input);
                }
            break;
            case 8 : System.out.println("Vibrating alert");
                System.out.println("Enter 0 for previous menu");
                userResponse = input.nextInt();
                while(userResponse == 0){
                    tonesOptions(input);
                }
            break;
            case 9 : System.out.println("Screen saver");
                System.out.println("Enter 0 for previous menu");
                userResponse = input.nextInt();
                while(userResponse == 0){
                    tonesOptions(input);
                }
            break;

        }
    }

    private static void settingsOptions(Scanner input) {
        System.out.println("Settings");
        System.out.println("""
                            1. Call settings
                            2. Phone settings
                            3. Security settings
                            4. Restore factory settings        
                            5. Exit                
                            """);
        int userResponse;
        userResponse = input.nextInt();
        switch (userResponse) {
            case 1:

                callSettingsOptions(input);
                break;
            case 2:

                phoneSettingsOptions(input);
                break;
            case 3:

                securitySettingOptions(input);
                break;
            case 4:
                System.out.println("Restore Factory settings");
                System.out.println("Enter 0 for previous menu");
                userResponse = input.nextInt();
                if(userResponse == 0){
                    settingsOptions(input);
                }
                break;
        }
    }

    private static void securitySettingOptions(Scanner input) {
        System.out.println("Security settings");
        System.out.println("""
                        1. PIN code request
                        2. Call barring service
                        3. Fixed dialing
                        4. Close user group
                        5. Phone security
                        6. Change access codes
                        7. Back
                              
                           """);
        int userResponse;
        userResponse = input.nextInt();
        switch (userResponse) {
            case 1 : System.out.println("PIN code request");
                System.out.println("Enter 0 for previous menu");
                userResponse = input.nextInt();
                while (userResponse == 0){
                  securitySettingOptions(input);
                }
            break;
            case 2 : System.out.println("Call barring service");
                System.out.println("Enter 0 for previous menu");
                userResponse = input.nextInt();
                while (userResponse == 0){
                    securitySettingOptions(input);
                }
            break;
            case 3 : System.out.println("Fixed dialing");
                System.out.println("Enter 0 for previous menu");
                userResponse = input.nextInt();
                while (userResponse == 0){
                    securitySettingOptions(input);
                }
            break;
            case 4 : System.out.println("Closer user group");
                System.out.println("Enter 0 for previous menu");
                userResponse = input.nextInt();
                while (userResponse == 0){
                    securitySettingOptions(input);
                }
            break;
            case 5 : System.out.println("Phone security");
                System.out.println("Enter 0 for previous menu");
                userResponse = input.nextInt();
                while (userResponse == 0){
                    securitySettingOptions(input);
                }
            break;
            case 6 : System.out.println("Change access codes");
                System.out.println("Enter 0 for previous menu");
                userResponse = input.nextInt();
                while (userResponse == 0){
                    securitySettingOptions(input);
                }
            break;
            case 7 :System.out.println("Back");
                System.out.println("Enter 0 for previous menu");
                userResponse = input.nextInt();
                while (userResponse == 0){
                    settingsOptions(input);
                }
                break;

        }
    }


    private static void phoneSettingsOptions(Scanner input) {
        System.out.println("Phone settings");
        System.out.println("""
                        1. Language
                        2. Cell info display
                        3. Welcome note
                        4. Network selection
                        5. Lights
                        6. Confirm SIM service actions  
                        7. Back           
                              
                              """);
        int userResponse;
        userResponse = input.nextInt();
        switch (userResponse) {
            case 1 : System.out.println("Language");
                System.out.println("Enter 0 for previous menu");
                userResponse = input.nextInt();
                while (userResponse == 0){
                    phoneSettingsOptions(input);
                }
            break;
            case 2 : System.out.println("Cell info display");
                System.out.println("Enter 0 for previous menu");
                userResponse = input.nextInt();
                while (userResponse == 0){
                    phoneSettingsOptions(input);
                }
            break;
            case 3 : System.out.println("Welcome note");
                System.out.println("Enter 0 for previous menu");
                userResponse = input.nextInt();
                while (userResponse == 0){
                    phoneSettingsOptions(input);
                }
            break;
            case 4 : System.out.println("Network selection");
                System.out.println("Enter 0 for previous menu");
                userResponse = input.nextInt();
                while (userResponse == 0){
                    phoneSettingsOptions(input);
                }
            break;
            case 5 : System.out.println("Light");
                System.out.println("Enter 0 for previous menu");
                userResponse = input.nextInt();
                while (userResponse == 0){
                    phoneSettingsOptions(input);
                }
            break;
            case 6 : System.out.println("Confirm SIM service actions");
                System.out.println("Enter 0 for previous menu");
                userResponse = input.nextInt();
                while (userResponse == 0){
                    phoneSettingsOptions(input);
                }
            break;
            case 7 :System.out.println("Back");
                System.out.println("Enter 0 for previous menu");
                userResponse = input.nextInt();
                while (userResponse == 0){
                    settingsOptions(input);
                }
                break;
        }
    }

    private static void callSettingsOptions(Scanner input) {
        System.out.println("Call Settings");
        System.out.println("""
                        1. Automatic redial
                        2. Speed dialing   
                        3. Call waiting options
                        4. Own number sending
                        5. Phone line in use
                        6. Automatic answer
                        7. Back
                                    """);
        int userResponse;
        userResponse = input.nextInt();
        switch (userResponse) {
            case 1 : System.out.println("Automatic redial");
            System.out.println("Enter 0 for previous menu");
            userResponse = input.nextInt();
            while (userResponse == 0){
                callSettingsOptions(input);
            }
            break;
            case 2 : System.out.println("Speed dialing");
                System.out.println("Enter 0 for previous menu");
                userResponse = input.nextInt();
                while (userResponse == 0){
                    callSettingsOptions(input);
                }
            break;
            case 3 : System.out.println("Call waiting options");
                System.out.println("Enter 0 for previous menu");
                userResponse = input.nextInt();
                while (userResponse == 0){
                    callSettingsOptions(input);
                }
            break;
            case 4 : System.out.println("Own number sending");
                System.out.println("Enter 0 for previous menu");
                userResponse = input.nextInt();
                while (userResponse == 0){
                    callSettingsOptions(input);
                }
            break;
            case 5 : System.out.println("Phone line in use");
                System.out.println("Enter 0 for previous menu");
                userResponse = input.nextInt();
                while (userResponse == 0){
                    callSettingsOptions(input);
                }
            break;
            case 6 : System.out.println("Automatic answer");
                System.out.println("Enter 0 for previous menu");
                userResponse = input.nextInt();
                while (userResponse == 0){
                    callSettingsOptions(input);
                }
            break;
            case 7 :System.out.println("Back");
                System.out.println("Enter 0 for previous menu");
                userResponse = input.nextInt();
                while (userResponse == 0){
                    settingsOptions(input);
                }
                break;
        }

    }


    private static void clockOption(Scanner input) {
        int userResponse;
        System.out.println("Clock");
        System.out.println("""
                1. Alarm clock
                2. Clock settings
                3. Date setting 
                4. Stopwatch
                5. Countdown timer
                6. Auto update of date and time
                7. Exit         
                                     """
        );
        userResponse = input.nextInt();
        switch (userResponse) {
            case 1 : System.out.println("Alarm clock");
                System.out.println("Back");
                System.out.println("Enter 0 for previous  menu");
                userResponse = input.nextInt();
                if (userResponse == 0){
                    clockOption(input);
                }
            break;
            case 2 : System.out.println("Clock settings");
                System.out.println("Back");
                System.out.println("Enter 0 for previous  menu");
                userResponse = input.nextInt();
                if (userResponse == 0){
                    clockOption(input);
                }
            break;
            case 3 : System.out.println("Date settings");
                System.out.println("Back");
                System.out.println("Enter 0 for previous  menu");
                userResponse = input.nextInt();
                if (userResponse == 0){
                    clockOption(input);
                }
            break;
            case 4 : System.out.println("Stopwatch");
                System.out.println("Back");
                System.out.println("Enter 0 for previous  menu");
                userResponse = input.nextInt();
                if (userResponse == 0){
                    clockOption(input);
                }
            break;
            case 5 : System.out.println("Countdown timer");
                System.out.println("Back");
                System.out.println("Enter 0 for previous  menu");
                userResponse = input.nextInt();
                if (userResponse == 0){
                    clockOption(input);
                }
            break;
            case 6 : System.out.println("Auto update of date and time");
                System.out.println("Back");
                System.out.println("Enter 0 for previous  menu");
                userResponse = input.nextInt();
                if (userResponse == 0){
                    clockOption(input);
                }
            break;
            case 7 :System.out.println("Exit");
                userResponse = input.nextInt();
                while (userResponse == 7){
                    mainMenu();
                }
                break;
        }


    }


    private static void message(Scanner input) {
        int userResponse;
        System.out.println("""
                1. Write messages
                2. Inbox
                3. Outbox
                4. Pictures messages
                5. Templates
                6. Smileys
                7. Message settings
                8. Info service
                9. Voice mailbox number
                10. Service command editor
                11. Back
                
                        """);
        userResponse = input.nextInt();
        switch (userResponse) {
            case 1 : System.out.println("Write messages");
                System.out.println("Enter 0 for previous menu ");
                userResponse = input.nextInt();
                if (userResponse == 0) {
                    message(input);
                }
            break;
            case 2 : System.out.println("Inbox");
                System.out.println("Enter 0 for previous menu ");
                userResponse = input.nextInt();
                if (userResponse == 0) {
                    message(input);
                }
            break;
            case 3 : System.out.println("Outbox");
                System.out.println("Enter 0 for previous menu ");
                userResponse = input.nextInt();
                if (userResponse == 0) {
                    message(input);
                }
            break;
            case 4 : System.out.println("Pictures messages");
                System.out.println("Enter 0 for previous menu ");
                userResponse = input.nextInt();
                if (userResponse == 0) {
                    message(input);
                }
            break;
            case 5 : System.out.println("Templates");
                System.out.println("Enter 0 for previous menu ");
                userResponse = input.nextInt();
                if (userResponse == 0) {
                    message(input);
                }
            break;
            case 6 : System.out.println("Smileys");
                System.out.println("Enter 0 for previous menu ");
                userResponse = input.nextInt();
                if (userResponse == 0) {
                    message(input);
                }
            break;
            case 7 :
                messageSettingsOptions(input);
                System.out.println("Enter 0 for previous menu");
                userResponse = input.nextInt();
                while (userResponse == 0){
                    message(input);
                }
                break;
                    case 8:
                        System.out.println("Info service");
                        System.out.println("Enter for previous menu ");
                        userResponse = input.nextInt();
                        if (userResponse == 0) {
                            message(input);
                        }
                        break;
                    case 9:
                        System.out.println("Voice mailbox number");
                        System.out.println("Enter 0 for previous menu ");
                        userResponse = input.nextInt();
                        if (userResponse == 0) {
                            message(input);
                        }
                        break;
                    case 10:
                        System.out.println("Service command editor");
                        System.out.println("Enter 0 for previous menu ");
                        userResponse = input.nextInt();
                        if (userResponse == 0) {
                            message(input);
                        }
                        break;

            }




    }

    private static void messageSettingsOptions(Scanner input) {
        int userResponse;
        System.out.println("Message settings");
        System.out.println("""
                1. Set
                2. Common
                3. Back
                """);
        userResponse = input.nextInt();
        switch (userResponse) {
            case 1:
                set1option(input);
                System.out.println("Enter 0 for previous menu");
                userResponse = input.nextInt();
                while (userResponse == 0){
                    messageSettingsOptions(input);
                }
                break;
            case 2:
                commonOption(input);
                System.out.println("Enter 0 for previous menu");
                userResponse = input.nextInt();
                while (userResponse == 0){
                    messageSettingsOptions(input);
                }
                break;
            case 3:
                System.out.println("Back");
                System.out.println("Enter 0 for previous menu ");
                userResponse = input.nextInt();
                while (userResponse == 0){
                    message(input);
                }
                break;
        }
    }

    private static void commonOption(Scanner input) {
        int userResponse;
        System.out.println("Common");
        System.out.println("""
                1. Delivery reports
                2. Reply via same centre
                3. Character support 
                4. Back  
                """);
        userResponse = input.nextInt();
        switch (userResponse) {
            case 1:
                System.out.println("Delivery reports");
                System.out.println("Enter 0 to go back to the previous menu ");
                userResponse = input.nextInt();
                while (userResponse == 0){
                    commonOption(input);
                }
                break;
            case 2:
                System.out.println("Reply via same centre");
                System.out.println("Enter 0 to go back to the previous menu ");
                userResponse = input.nextInt();
                while (userResponse == 0){
                    commonOption(input);
                }
                break;
            case 3:
                System.out.println("Character support");
                System.out.println("Enter 0 for previous menu ");
                userResponse = input.nextInt();
                while (userResponse == 0){
                   commonOption(input);
                }
                break;
            case 4:
                System.out.println("Back");
                System.out.println("Enter 0 for previous menu ");
                userResponse = input.nextInt();
                while (userResponse == 0){
                   messageSettingsOptions(input);
                }
                break;
        }
        return;
    }

    private static void set1option(Scanner input) {
        int userResponse;
        System.out.println("Set 1");
        System.out.println("""
                1.Message centre number
                2.Messages sent as
                3.Messages validity 
                4.Back
                
                """);
        userResponse = input.nextInt();
        switch (userResponse) {
            case 1:
                System.out.println("Message centre number");
                System.out.println("Enter 0 for previous menu ");
                userResponse = input.nextInt();
                while (userResponse == 0){
                    set1option(input);
                }
                break;
            case 2:
                System.out.println("Message sent as");
                System.out.println("Enter 0 for previous menu ");
                userResponse = input.nextInt();
                while (userResponse == 0){
                    set1option(input);
                }
                break;
            case 3:
                System.out.println("Message validity");
                System.out.println("Enter 0 for previous menu ");
                userResponse = input.nextInt();
                while (userResponse == 0){
                    set1option(input);
                }
                break;
            case 4:
                System.out.println("Back");
                System.out.println("Enter 0 for previous menu ");
                userResponse = input.nextInt();
                while (userResponse == 0){
                    messageSettingsOptions(input);
                }
                break;


        }
        return;
    }

    private static void phoneBookMenu(Scanner input) {
        int userResponse;
        System.out.println("""
                 1. Search
                 2. Service Nos
                 3. Add name 
                 4. Erase
                 5. Edit
                 6. Assign tone
                 7. Send b'card
                 8. Options
                 9. Speed dials
                 10. Voice tags
                 0. Back
                """);
        userResponse = input.nextInt();
        switch (userResponse) {
            case 1 : System.out.println("Search");
            System.out.println("Enter 0 for previous menu");
            userResponse = input.nextInt();
            if (userResponse == 0){
                phoneBookMenu(input);
            }

            break;
            case 2 : System.out.println("Service Nos");
                System.out.println("Enter 0 for previous menu");
                userResponse = input.nextInt();
                if (userResponse == 0){
                    phoneBookMenu(input);
                }
            break;
            case 3 : System.out.println("Add name");
                System.out.println("Enter 0 for previous menu");
                userResponse = input.nextInt();
                if (userResponse == 0){
                    phoneBookMenu(input);
                }
            break;
            case 4 : System.out.println("Erase");
                System.out.println("Enter 0 for previous menu");
                userResponse = input.nextInt();
                if (userResponse == 0){
                    phoneBookMenu(input);
                }
            break;
            case 5 : System.out.println("Edit");
                System.out.println("Enter 0 for previous menu");
                userResponse = input.nextInt();
                if (userResponse == 0){
                    phoneBookMenu(input);
                }
            break;
            case 6 : System.out.println("Assign tone");
                System.out.println("Enter 0 for previous menu");
                userResponse = input.nextInt();
                if (userResponse == 0){
                    phoneBookMenu(input);
                }
            break;
            case 7 : System.out.println("Send b'card");
                System.out.println("Enter 0 for previous menu");
                userResponse = input.nextInt();
                if (userResponse == 0){
                    phoneBookMenu(input);
                }
            break;
            case 8 : option(input);
            System.out.println("Enter 0 for previous menu");
            userResponse = input.nextInt();
            if (userResponse == 0){
                phoneBookMenu(input);
            }
            break;
            case 9 : System.out.println("Speed dail");
                System.out.println("Enter 0 for previous menu");
                userResponse = input.nextInt();
                if (userResponse == 0){
                    phoneBookMenu(input);
                }
            break;
            case 10 : System.out.println("Voice tags");
                System.out.println("Enter 0 for previous menu");
                userResponse = input.nextInt();
                if (userResponse == 0){
                    phoneBookMenu(input);
                }
            break;
            case 11: System.out.println("Enter 0 to exit to main menu");
            userResponse = input.nextInt();
            if (userResponse == 0){
                mainMenu();
            }

        }
    }

    private static void option(Scanner input) {
        int userResponse;
        System.out.println("Options");
        System.out.println("""
                1. Type of view
                2. Memory status 
                3. Back       
                """);
        userResponse = input.nextInt();
        switch (userResponse) {
            case 1 : System.out.println("Type of view");
            System.out.println("Enter 0 for previous menu");
            userResponse = input.nextInt();
                if (userResponse == 0) {
                    option(input);

                }

            break;
            case 2 : System.out.println("Memory status");
                System.out.println("Enter 0 for previous menu");
                userResponse = input.nextInt();
                if (userResponse == 0) {
                    option(input);

                }
                break;
            case 3: System.out.println("Back");
            System.out.println("Enter 0 for phonebook menu");
            userResponse = input.nextInt();
            if (userResponse == 0){
                phoneBookMenu(input);
            }
            break;
        }
    }

    private static void mainMenu() {
        System.out.println("List of menu functions");
        System.out.println("""
                1. Phone Book
                2. Messages
                3. Chat
                4. Call register
                5. Tones
                6. Settings
                7. Call divert
                8. Games
                9. Calculator
                10. Reminder
                11. Clock
                12. Profile
                13. Sim services
                                
                """);
    }
}

