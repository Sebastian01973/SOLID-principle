package good;

public class Pinguino implements Bird, SwimBird {
    
    public String name;

    public Pinguino(String name) {
        this.name = name;
    }
    
    @Override
    public String eat() {
        return (name + " horario especial para comer");
    }
    
    @Override
    public String swim() {
        return(name + " ave nadadora");
    }
}
