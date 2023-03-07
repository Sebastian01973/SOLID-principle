public class Main {

    public static void jump_hole(LightWeightAnimal animal){
        animal.walk();
        animal.jump();
        animal.walk();
    }
    public static void main(String[] args) {
        LightWeightAnimal dog = new Dog();
        jump_hole(dog);
        Animal elephant = new Elephant();
    }
}