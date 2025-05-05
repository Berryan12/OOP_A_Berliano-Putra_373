import java.util.Scanner;

// Main Class for Role Selection and Login
public class Main {
    public static void main(String[] args) {
        Admin admin = new Admin("admin", "password");
        BankAccount studentAccount = new BankAccount("123456", "Student", 17819452005.0);
        Student student = new Student("Berliano", "NIM373", studentAccount);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih peran: 1. Admin | 2. Student");
        int role = scanner.nextInt();

        if (role == 1) {
            System.out.println("Masukkan username admin:");
            String username = scanner.next();
            System.out.println("Masukkan password admin:");
            String password = scanner.next();

            if (admin.login(username, password)) {
                System.out.println("Login admin berhasil!");
                // Admin-specific functionality can go here.
                System.out.println("Selamat datang di sistem admin.");
            } else {
                System.out.println("Login admin gagal!");
            }
        } else if (role == 2) {
            System.out.println("Masukkan nama mahasiswa:");
            String name = scanner.next();
            System.out.println("Masukkan NIM mahasiswa:");
            String studentID = scanner.next();

            if (student.login(name, studentID)) {
                System.out.println("Login student berhasil!");
                student.displayBankInfo();
                student.performBankingOperations();
            } else {
                System.out.println("Login student gagal!");
            }
        } else {
            System.out.println("Peran tidak valid.");
        }

        scanner.close();
    }
}
