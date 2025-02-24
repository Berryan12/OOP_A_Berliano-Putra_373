import java.util.Scanner;
import java.time.LocalDate;

public class PersonalInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membaca input dari pengguna.
        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter gender (M/F): ");
        char genderChar = scanner.next().charAt(0);

        System.out.print("Enter year of birth: ");
        int yearOfBirth = scanner.nextInt();

        // Menghitung usia pengguna.
        int currentYear = LocalDate.now().getYear();
        int age = currentYear - yearOfBirth;

        // Menentukan jenis kelamin berdasarkan input.
        String gender;
        if (genderChar == 'M' || genderChar == 'm') {
            gender = "Male";
        } else if (genderChar == 'F' || genderChar == 'f') {
            gender = "Female";
        } else {
            gender = "Unknown";
        }

        // Menampilkan informasi pengguna.
        System.out.println("\nPersonal Data:");
        System.out.println("Name    : " + name);
        System.out.println("Gender  : " + gender);
        System.out.println("Age     : " + age + " years");

        // Menutup Scanner.
        scanner.close();
    }
}
