public class Main {

    public static void jumpHole(Animal animal) throws Exception {
        animal.walk();
        animal.jump();
        animal.walk();
    }
    public static void main(String[] args) throws Exception {
        Animal animal = new Animal();
        jumpHole(animal);
        Elephant elephant = new Elephant();
        jumpHole(elephant);
    }
}