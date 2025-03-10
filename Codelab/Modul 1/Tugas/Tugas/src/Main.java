 import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select Login Type:");
        System.out.println("1. Admin");
        System.out.println("2. Student");
        System.out.print("Enter choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        if (choice == 1) {
            adminLogin(scanner);
        } else if (choice == 2) {
            studentLogin(scanner);
        } else {
            System.out.println("Invalid choice.");
        }

        scanner.close();
    }

    private static void adminLogin(Scanner scanner) {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();


        if (username.equals("Admin373") && password.equals("Password373")) {
            System.out.println("Admin login successful!");
        } else {
            System.out.println("Login failed! Wrong username or password.");
        }
    }

    private static void studentLogin(Scanner scanner) {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter student ID: ");
        String studentID = scanner.nextLine();


        if (name.equals("Berliano Putra") && studentID.equals("202410370110373")) {
            System.out.println("Student Login Successful!");
            System.out.println("Name: " + name);
            System.out.println("Student ID: " + studentID);
        } else {
            System.out.println("Login Failed! Wrong name or student ID.");
        }
    }
}
