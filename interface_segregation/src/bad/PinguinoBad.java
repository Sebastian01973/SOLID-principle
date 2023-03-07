package bad;

public class PinguinoBad implements Bird {
    
    private String name;
    
    public PinguinoBad(String name) {
        this.name = name;
    }

    @Override
    public String eat() {
        return (name + " horario especial para comer");
    }

    @Override
    public String fly() {
        return (name + " no es un ave voladora");
    }

    @Override
    public String swim() {
        return (name + " ave nadadora");
    }

    @Override
    public String run() {
        return (name + " No es un ave que corra");
    }
}
