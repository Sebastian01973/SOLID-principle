package bad;

public class AvestruzBad implements Bird {
    
    private String name;

    public AvestruzBad(String name) {
        this.name = name;
    }

    @Override
    public String eat() {
        return (name + " horario especial para comer");
    }

    @Override
    public String fly() {
        return (name + " No es un ave que nade");
    }

    @Override
    public String swim() {
        return (name + " no es un ave voladora");
    }

    @Override
    public String run() {
        return (name + " Es un ave corredora");
    }
}
