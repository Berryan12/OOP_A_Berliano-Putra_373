// Superclass GameCharacter
class GameCharacter {
    private String name;  // Name of the character
    private int health;   // Health of the character

    // Constructor to initialize the name and health
    public GameCharacter(String name, int health) {
        this.name = name;
        this.health = health;
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for health
    public int getHealth() {
        return health;
    }

    // Setter method for health
    public void setHealth(int health) {
        this.health = health;
    }

    // Method to be overridden by subclasses for character attack
    public void attack(GameCharacter target) {
        // This method will be defined in subclasses
    }
}

// Subclass Hero extending GameCharacter
class Hero extends GameCharacter {
    // Constructor to initialize Hero using the superclass constructor
    public Hero(String name, int health) {
        super(name, health);
    }

    // Override the attack method
    @Override
    public void attack(GameCharacter target) {
        // Simulate attacking the target using a sword
        System.out.println(getName() + " attacked " + target.getName() + " using a sword!");
        // Reduce target's health by 20 points
        target.setHealth(target.getHealth() - 20);
        // Display the target's current health
        System.out.println(target.getName() + " now has " + target.getHealth() + " health.");
    }
}

// Subclass Enemy extending GameCharacter
class Enemy extends GameCharacter {
    // Constructor to initialize Enemy using the superclass constructor
    public Enemy(String name, int health) {
        super(name, health);
    }

    // Override the attack method
    @Override
    public void attack(GameCharacter target) {
        // Simulate attacking the target using magic
        System.out.println(getName() + " attacked " + target.getName() + " using magic!");
        // Reduce target's health by 15 points
        target.setHealth(target.getHealth() - 15);
        // Display the target's current health
        System.out.println(target.getName() + " now has " + target.getHealth() + " health.");
    }
}

// Main class to simulate the game scenario
public class Main {
    public static void main(String[] args) {
        // Create a general GameCharacter object
        GameCharacter generalCharacter = new GameCharacter("General Character", 100);

        // Create a Hero object
        Hero brimstone = new Hero("Brimstone", 150);

        // Create an Enemy object
        Enemy viper = new Enemy("Viper", 200);

        // Display initial status of the Hero and Enemy
        System.out.println("Initial status:");
        System.out.println(brimstone.getName() + " has health: " + brimstone.getHealth());
        System.out.println(viper.getName() + " has health: " + viper.getHealth());

        // Simulate attacks
        brimstone.attack(viper); // Brimstone attacks Viper
        brimstone.attack(viper); // Brimstone attacks Viper again
        viper.attack(brimstone); // Viper attacks Brimstone
    }
}
