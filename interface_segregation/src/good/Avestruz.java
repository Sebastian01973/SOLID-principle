package good;

public class Avestruz implements Bird,RunBird {
    
    public String name;

    public Avestruz(String name) {
        this.name = name;
    }

    @Override
    public String eat() {
        return (name + " horario especial para comer");
    }

    @Override
    public String run() {
        return (name + " Es un ave corredora");
    }
}
