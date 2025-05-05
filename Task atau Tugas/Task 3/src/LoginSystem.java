import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Buat contoh admin dan student
        Admin admin = new Admin("Beruang Putar", "admin gacor", "password");
        Student student = new Student("Jejune Craft", "432");

        System.out.println("Login as:\n1. Admin\n2. Student");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        boolean success = false;

        if (choice == 1) {
            System.out.print("Enter username: ");
            String uname = scanner.nextLine();
            System.out.print("Enter password: ");
            String pwd = scanner.nextLine();

            if (admin.login(uname, pwd)) {
                admin.displayInfo();
                success = true;
            }
        } else if (choice == 2) {
            System.out.print("Enter name: ");
            String name = scanner.nextLine();
            System.out.print("Enter student ID: ");
            String id = scanner.nextLine();

            if (student.login(name, id)) {
                student.displayInfo();
                success = true;
            }
        }

        if (!success) {
            System.out.println("Login failed. Please check your credentials.");
        }

        scanner.close();
    }
}
