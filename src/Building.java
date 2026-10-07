import java.util.ArrayList;

public class Building {

    String name;
    ArrayList<Room> rooms;

    public Building(String name) {
        this.name = name;
        rooms = new ArrayList<>();
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public int getTotalLampCount() {

        int totalLamps = 0;

        for (Room room : rooms) {
            totalLamps += room.getLampCount();
        }

        return totalLamps;
    }

    public int getTotalWatt() {

        int totalWatt = 0;

        for (Room room : rooms) {
            totalWatt += room.getTotalWatt();
        }

        return totalWatt;
    }

    public void printBuilding() {

        System.out.println("=== " + name + " ===");
        System.out.println();

        for (Room room : rooms) {
            room.printRoom();
        }

        System.out.println("Total: " + getTotalLampCount()
                + " lamper, " + getTotalWatt() + "W");
    }
}