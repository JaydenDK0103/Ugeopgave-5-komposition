public class Lamp {

    int watt;
    boolean isOn;

    public Lamp(int watt) {
        this.watt = watt;
        this.isOn = false;
    }

    public String toString() {
        return watt + "W";
    }


}