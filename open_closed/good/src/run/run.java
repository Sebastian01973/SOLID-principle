package good.src.run;

import good.src.models.*;

public class run {
    public static void main(String[] args) {
        // Saludo Informal
        Greeter greeter = new Greeter(new CasualPersonality());
        System.out.println(greeter.greet());

        // Saludo Formal
        greeter = new Greeter(new FormalPersonality());
        System.out.println(greeter.greet());
    }
}
