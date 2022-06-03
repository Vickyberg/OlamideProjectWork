package tdd;

public class Hotel {
    private String[] rooms;
    public Hotel(int numberOfRooms) {
        this.rooms = new String[numberOfRooms];
    }

    public String[] getRooms() {
        return rooms;

    }

    public String bookRoom(String name) {
        for(int i = 0; i < rooms.length;i++){
            if(rooms[i]== null){
                rooms[i] = name;
                return "Booked Successfully by " + name;
            }
        }
        return "All rooms are booked successfully";
    }

    public String getRoomGuest(int roomNumber) {
        return rooms[roomNumber - 1];
    }

    public void checkOut(int roomNumber) {
        rooms[roomNumber - 1] = null;
     }
}
