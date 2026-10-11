package core_java.bird;

public abstract class AquaticBird {
    protected String name;

    protected AquaticBird(String name) {
        this.name = name;
    }

    abstract protected void swim();
}
