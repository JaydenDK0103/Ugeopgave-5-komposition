public class Animal {
    String name;
    int energy;

    public Animal(int energy, String name) {
        this.energy = energy;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }
    boolean isActive(){
        if(energy>0){
            return true;
        }else{
            return false;
        }
    }
    int attack(){
        return 30;
    }
    @Override
    public String toString() {
        return "Name: " + name + ", Energy: " + energy;
    }

}
