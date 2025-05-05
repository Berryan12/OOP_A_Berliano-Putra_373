class User {
    private String name;

    // Constructor
    public User(String name) {
        this.name = name;
    }

    // Getter & Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Method to be overridden
    public boolean login(String input1, String input2) {
        return false;
    }

    // Display user info
    public void displayInfo() {
        System.out.println("Name: " + name);
    }
}