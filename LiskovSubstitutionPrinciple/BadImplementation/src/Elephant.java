public class Elephant extends Animal{
    @Override
    public void jump() throws Exception {
        throw new Exception("The elephants can't jump");
    }
}
