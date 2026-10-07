public class Wolf extends Animal {
    public Wolf(String name,int energy) {
        super(energy, name);
    }

    @Override
    int attack() {
        return (int)(Math.random() * 40) + 10; // 10-50
    }
}