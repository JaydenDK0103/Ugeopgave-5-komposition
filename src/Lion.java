public class Lion extends Animal {
    public Lion(String name,int energy) {
        super(energy, name);
    }

    @Override
    int attack() {
        return 50;
    }
}