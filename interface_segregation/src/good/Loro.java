package good;

public class Loro implements Bird, FlyBird {

    private String name;

    public Loro(String name) {
        this.name = name;
    }

    @Override
    public String eat() {
        return (name + " horario especial para comer");
    }

    @Override
    public String fly() {
        return (name + " ave voladora");
    }
}
