public class Octopus extends Animal implements Movement{
private int tentacles;

    public Octopus(int feet, String name, String type, int tentacles) {
        super(feet, name, type);
        this.tentacles = tentacles;
    }

    @Override
    public String toString() {
        return "Octopus{" +
                "tentacles=" + tentacles +
                "} " + super.toString();
    }
}
