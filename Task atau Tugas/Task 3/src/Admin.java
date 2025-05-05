class Admin extends User {
    private String username;
    private String password;

    public Admin(String name, String username, String password) {
        super(name);
        this.username = username;
        this.password = password;
    }

    @Override
    public boolean login(String inputUsername, String inputPassword) {
        return this.username.equals(inputUsername) && this.password.equals(inputPassword);
    }

    @Override
    public void displayInfo() {
        System.out.println("Admin login successful.");
        System.out.println("Name: " + getName());
        System.out.println("Username: " + username);
    }
}
