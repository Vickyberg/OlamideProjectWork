package ChibobAss;

import tdd.Hotel;

import java.util.Scanner;

public class HotelMain {
    public static void main(String[] args) {
        Hotel myHotel = new Hotel(50);
        System.out.println("WELCOME TO VICOLA HOTEL!!!");
        int sentinel = 1;
        while(sentinel != 0){
            String prompt = """
                    Enter 1 to book a room
                    Enter 2 to check out
                    Enter 3 to check room details
                    Enter 0 to exit
                    """;
            System.out.println(prompt);
            Scanner input = new Scanner(System.in);
            int userResponse = input.nextInt();
            input.nextLine();
            switch (userResponse){
                case 1:
                    System.out.println("Enter your name");
                    String name = input.nextLine();
                    myHotel.bookRoom(name);
                    break;
                case 2:
                    System.out.println("THANKS FOR CHOOSING VICOLA HOTEL!!");
                    System.out.println("Enter your room number to check out: ");
                    int roomNumber = input.nextInt();
                    myHotel.checkOut(roomNumber);
                    break;
                case 3:
                    System.out.println("Enter room number to check details: ");
                    roomNumber = input.nextInt();
                    String guest = myHotel.getRoomGuest(roomNumber);
                    System.out.println("Guest is " + guest);
                    break;
                case 0:
                    sentinel = 0;
                    System.out.println("THANKS FOR STAYING!!!");
                    break;
            }
        }
    }
}
