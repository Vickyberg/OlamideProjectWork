package tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HotelTest {
    Hotel hotel;

    @BeforeEach
    void setUp(){
        hotel = new Hotel(5);
    }
    @Test
    void testThatHostelWasCreatedWithSpecificNumberOfRooms(){
        assertEquals(5, hotel.getRooms().length);
    }
    @Test
    void testThatWeCanGetRooms(){
        //Get all rooms from Hotel
        String[] allRoomsArray = hotel.getRooms();
        //Assert that we have rooms
        assertNotNull(allRoomsArray);
        //Assert that rooms are empty
        for (String room: allRoomsArray){
            assertNull(room);
        }
    }
    @Test
    void testThatWeCanBookARoom(){
        String name ="Olamide";
        String result = hotel.bookRoom(name);
        System.out.println(result);
        String roomGuest = hotel.getRoomGuest(1);
        assertEquals(name,roomGuest);
        String secondName = "Victor";
        String result2 = hotel.bookRoom(secondName);
        System.out.println(result2);
        String roomGuest2 = hotel.getRoomGuest(2);
        assertEquals(secondName,roomGuest2);

    }
    @Test
    void testThatUserCanCheckOut(){
        String name = "Olamide";
        String result = hotel.bookRoom(name);
        String secondName = "Victor";
        String result2 = hotel.bookRoom(secondName);
        int roomNumber = 1;
        hotel.checkOut(roomNumber);
        String guest = hotel.getRoomGuest(roomNumber);
        assertNull(guest);

    }
}
