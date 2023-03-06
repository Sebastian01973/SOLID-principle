package bad.src;

import java.util.Objects;

public class Greeter {
    String formality;

    public String greet() {
        if (Objects.equals(this.formality, "formal")) {
            return "Good evening, sir.";
        } else if (Objects.equals(this.formality, "casual")) {
            return "Sup bro?";
        } else if (Objects.equals(this.formality, "intimate")) {
            return "Hello Darling!";
        } else {
            return "Hello.";
        }
    }

    public void setFormality(String formality) {
        this.formality = formality;
    }

    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        greeter.setFormality("formal");
        System.out.println(greeter.greet());
        greeter.setFormality("casual");
        System.out.println(greeter.greet());
        greeter.setFormality("intimate");
        System.out.println(greeter.greet());
        greeter.setFormality("other");
        System.out.println(greeter.greet());
    }
}

