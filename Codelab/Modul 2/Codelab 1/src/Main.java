class Animal {
    String name;
    String type;
    String sound;

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Sound: " + sound);
    }
}

public class Main {
    public static void main(String[] args) {
        Animal cat = new Animal();
        cat.name = "Cat";
        cat.type = "Mammal";
        cat.sound = "Meow";

        Animal dog = new Animal();
        dog.name = "Dog";
        dog.type = "Mammal";
        dog.sound = "Woof";

        cat.displayInfo();
        System.out.println();
        dog.displayInfo();
    }
}
