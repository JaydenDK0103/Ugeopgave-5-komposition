public class Rabbit extends Animal {
    public Rabbit(String name,int energy) {
        super(energy, name);
    }

    @Override
    int attack() {
        return 5;
    }
}