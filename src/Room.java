import java.util.ArrayList;

public class Room {

    String name;
    ArrayList<Lamp> lamps;
    ArrayList<Window> windows;

    public Room(String name) {
        this.name = name;
        lamps = new ArrayList<>();
        windows = new ArrayList<>();
    }

    public void addLamp(Lamp lamp) {
        lamps.add(lamp);
    }

    public void addWindow(Window window) {
        windows.add(window);
    }

    public int getLampCount() {
        return lamps.size();
    }

    public int getTotalWatt() {

        int totalWatt = 0;

        for (Lamp lamp : lamps) {
            totalWatt += lamp.watt;
        }

        return totalWatt;
    }

    public void printRoom() {

        System.out.println(name + " (" + getLampCount() + " lamps, " + windows.size() + " windows");

        System.out.println("Lamps: ");

        for (Lamp lamp : lamps) {
            System.out.println(lamp + " ");
        }

        System.out.println("(Total: " + getTotalWatt() + "W)");

        System.out.println("Windows: ");

        for (Window window : windows) {
            System.out.println(window + " ");
        }

        System.out.println();
        System.out.println();
    }
}