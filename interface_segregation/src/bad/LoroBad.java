package bad;

public class LoroBad implements Bird{
    private String name;

    public LoroBad(String name) {
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

    @Override
    public String swim() {
        return (name + " No es un ave que nade");

    }

    @Override
    public String run() {
        return (name + " No es un ave que corra");
    }
}
