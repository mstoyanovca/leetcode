package core_java.polymorphism;

public class Seagull extends AquaticBird implements Bird {
    public Seagull(String name) {
        super(name);
    }

    @Override
    public void sing() {
        System.out.println("squawk, squawk");
    }

    @Override
    protected void swim() {
        System.out.println("SeaGull swimming");
    }

    static void main(String[] args) {
        Seagull seagull = new Seagull("Herring Gull");
        System.out.println(seagull.name);
        seagull.sing();
        seagull.swim();
    }
}
