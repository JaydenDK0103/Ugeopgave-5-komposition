public class Window {

    int widthCm;
    int heigthCm;

    public Window( int widthCm, int heigthCm) {
        this.widthCm = widthCm;
        this.heigthCm = heigthCm;
    }

    public int getAreaCm2() {
        return widthCm * heigthCm;
    }

    public String toString() {
        return widthCm + "x" + heigthCm + "cm";
    }


}
