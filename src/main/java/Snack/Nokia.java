package Snack;

import java.util.Scanner;

public class Nokia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
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
                10.  Reminder
                11. Clock
                12. Profile
                13. Sim services
                """);
        int userResponse = input.nextInt();
        switch (userResponse){
            case 1: {
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
                       """);
                userResponse = input.nextInt();
                switch (userResponse) {
                    case 1 -> System.out.println("Search");
                    case 2 -> System.out.println("Service Nos");
                    case 3 -> System.out.println("Add name");
                    case 4 -> System.out.println("Erase");
                    case 5 -> System.out.println("Edit");
                    case 6 -> System.out.println("Assign tone");
                    case 7 -> System.out.println("Send b'card");
                    case 8 -> {
                        System.out.println("Options");
                        System.out.println("""
                                1. Type of view
                                2. Memory status        
                                """);
                        userResponse = input.nextInt();
                        switch (userResponse) {
                            case 1 -> System.out.println("Type of view");
                            case 2 -> System.out.println("Memory status");
                        }
                    }
                    case 9 -> System.out.println("Speed dail");
                    case 10 -> System.out.println("Voice tags");
                }
                break;



            }
            case 2:{
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
                                """);
                userResponse = input.nextInt();
                switch (userResponse) {
                    case 1 -> System.out.println("Write messages");
                    case 2 -> System.out.println("Inbox");
                    case 3 -> System.out.println("Outbox");
                    case 4 -> System.out.println("Pictures messages");
                    case 5 -> System.out.println("Templates");
                    case 6 -> System.out.println("Smileys");
                    case 7 -> {
                        System.out.println("Message settings");
                        System.out.println("""
                                1. Set
                                2. Common
                                """);
                        userResponse = input.nextInt();
                        switch (userResponse) {
                            case 1 -> {
                                System.out.println("Set 1");
                                System.out.println("""
                                        1.Message centre number
                                        2.Messages sent as
                                        3.Messages validity  
                                        """);
                                userResponse = input.nextInt();
                                switch (userResponse) {
                                    case 1 -> System.out.println("Message centre number");
                                    case 2 -> System.out.println("Message sent as");
                                    case 3 -> System.out.println("Message validity");
                                }
                            }
                            case 2 -> {
                                System.out.println("Common");
                                System.out.println("""
                                        1. Delivery reports
                                        2. Reply via same centre
                                        3. Character support   
                                        """);
                                userResponse = input.nextInt();
                                switch (userResponse) {
                                    case 1 -> System.out.println("Delivery reports");
                                    case 2 -> System.out.println("Reply via same centre");
                                    case 3 -> System.out.println("Character support");
                                }
                            }
                            case 8 -> System.out.println("Info service");
                            case 9 -> System.out.println("Voice mailbox number");
                            case 10 -> System.out.println("Service command editor");
                        }


                    }


                }
                break;

            }
            case 3:
                System.out.println("Chat");
                break;
            case 4:
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
                       """);
                userResponse = input.nextInt();
                switch (userResponse) {
                    case 1 -> System.out.println("Missed calls");
                    case 2 -> System.out.println("Received calls");
                    case 3 -> System.out.println("Dialled numbers");
                    case 4 -> System.out.println("Erase recent call lists");
                    case 5 -> {
                        System.out.println("Show call duration");
                        System.out.println("""
                                1.Last call duration
                                2.All calls' duration
                                3.Received calls' duration
                                4.Dialled calls' duration
                                5.Clear times        
                                """);
                        userResponse = input.nextInt();
                        switch (userResponse) {
                            case 1 -> System.out.println("Last call duration");
                            case 2 -> System.out.println("All calls' duration");
                            case 3 -> System.out.println("Received calls' duration");
                            case 4 -> System.out.println("Dialled calls' duration");
                            case 5 -> System.out.println("Clear times");
                        }
                    }
                    case 6 -> {
                        System.out.println("Show call costs");
                        System.out.println("""
                                1. Last call cost
                                2. All calls' cost
                                3. Clear counters  
                                """);
                        userResponse = input.nextInt();
                        switch (userResponse) {
                            case 1 -> System.out.println("Last call cost");
                            case 2 -> System.out.println("All calls' cost");
                            case 3 -> System.out.println("Clear counters");
                        }
                    }
                    case 7 -> {
                        System.out.println("Call cost settings");
                        System.out.println("""
                                1.Call cost limit
                                2.Show costs in 
                                """);
                        userResponse = input.nextInt();
                        switch (userResponse) {
                            case 1 -> System.out.println("Call cost limt");
                            case 2 -> System.out.println("Show cost in");
                        }
                    }
                    case 8 -> System.out.println("Prepaid credit");

                }
            case 5: System.out.println("Tones");
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
                    
                            """);
            userResponse = input.nextInt();
                switch (userResponse) {
                    case 1 -> System.out.println("Ringing tones");
                    case 2 -> System.out.println("Ringing volume");
                    case 3 -> System.out.println("Incoming call alert");
                    case 4 -> System.out.println("Composer");
                    case 5 -> System.out.println("Message alert tone");
                    case 6 -> System.out.println("Keypad tones");
                    case 7 -> System.out.println("Warning and game tones");
                    case 8 -> System.out.println("Vibrating alert");
                    case 9 -> System.out.println("Screen saver");
                }
            break;
            case 6: System.out.println("Settings");
            System.out.println("""
                    1. Call settings
                    2. Phone settings
                    3. Security settings
                    4. Restore factory settings        
                    
                    """);
            userResponse = input.nextInt();
            switch (userResponse){
                case 1: System.out.println("Call Settings");
                System.out.println( """
                    1. Automatic redial
                    2. Speed dialing   
                    3. Call waiting options
                    4. Own number sending
                    5. Phone line in use
                    6. Automatic answer
                                """);
                userResponse = input.nextInt();
                    switch (userResponse) {
                        case 1 -> System.out.println("Automatic redial");
                        case 2 -> System.out.println("Speed dialing");
                        case 3 -> System.out.println("Call waiting options");
                        case 4 -> System.out.println("Own number sending");
                        case 5 -> System.out.println("Phone line in use");
                        case 6 -> System.out.println("Automatic answer");
                    }
                    break;
                case 2: System.out.println("Phone settings");
                    System.out.println("""
                      1. Language
                      2. Cell info display
                      3. Welcome note
                      4. Network selection
                      5. Lights
                      6. Confirm SIM service actions             
                            
                            """);
                    userResponse = input.nextInt();
                    switch (userResponse) {
                        case 1 -> System.out.println("Language");
                        case 2 -> System.out.println("Cell info display");
                        case 3 -> System.out.println("Welcome note");
                        case 4 -> System.out.println("Network selection");
                        case 5 -> System.out.println("Light");
                        case 6 -> System.out.println("Confirm SIM service actions");
                    }
                    break;
                case 3: System.out.println("Security settings");
                    System.out.println("""
                         1. PIN code request
                         2. Call barring service
                         3. Fixed dialing
                         4. Close user group
                         5. Phone security
                         6. Change access codes
      
                            """);
                    userResponse = input.nextInt();
                    switch (userResponse) {
                        case 1 -> System.out.println("PIN code request");
                        case 2 -> System.out.println("Call barring service");
                        case 3 -> System.out.println("Fixed dialing");
                        case 4 -> System.out.println("Closer user group");
                        case 5 -> System.out.println("Phone security");
                        case 6 -> System.out.println("Change access codes");
                    }
                    break;
                case 4: System.out.println("Restore Factory settings");
                    break;
           }
            case 7: System.out.println("Call divert");
                break;
            case 8: System.out.println("Games");
                break;
            case 9: System.out.println("Calculator");
                break;
            case 10: System.out.println("Reminders");
                break;
            case 11: System.out.println("Clock");
                System.out.println("""
                   1. Alarm clock
                   2. Clock settings
                   3. Date setting 
                   4. Stopwatch
                   5. Countdown timer
                   6. Auto update of date and time           
                                        """
                );
                userResponse = input.nextInt();
                switch (userResponse) {
                    case 1 -> System.out.println("Alarm clock");
                    case 2 -> System.out.println("Clock settings");
                    case 3 -> System.out.println("Date settings");
                    case 4 -> System.out.println("Stopwatch");
                    case 5 -> System.out.println("Countdown timer");
                    case 6 -> System.out.println("Auto update of date and time");
                }
                break;
            case 12: System.out.println("Profiles");
                break;
            case 13: System.out.println("Sim services");
                break;

       }


   }
}
