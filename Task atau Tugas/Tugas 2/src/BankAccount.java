import java.util.Scanner;

// Admin Class
class Admin {
    private String username;
    private String password;

    public Admin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean login(String inputUsername, String inputPassword) {
        return username.equals(inputUsername) && password.equals(inputPassword);
    }
}

// Student Class with BankAccount Functionality
class Student {
    private String name;
    private String studentID;
    private BankAccount bankAccount;

    public Student(String name, String studentID, BankAccount bankAccount) {
        this.name = name;
        this.studentID = studentID;
        this.bankAccount = bankAccount;
    }

    public boolean login(String inputName, String inputID) {
        return name.equals(inputName) && studentID.equals(inputID);
    }

    public void displayBankInfo() {
        bankAccount.displayInfo();
    }

    public void performBankingOperations() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pilih operasi: 1. Setor | 2. Tarik");
        int operation = scanner.nextInt();

        System.out.println("Masukkan jumlah:");
        double amount = scanner.nextDouble();

        if (operation == 1) {
            bankAccount.depositMoney(amount);
        } else if (operation == 2) {
            bankAccount.withdrawMoney(amount);
        } else {
            System.out.println("Operasi tidak valid.");
        }
    }
}

// BankAccount Class
class BankAccount {
    private String accountNumber;
    private String ownerName;
    private double balance;

    public BankAccount(String accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public void displayInfo() {
        System.out.println("Nomor Rekening: " + accountNumber);
        System.out.println("Nama Pemilik: " + ownerName);
        System.out.printf("Saldo: Rp%.2f%n", balance);
    }

    public void depositMoney(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.printf("%s menyetor Rp%.2f. Saldo sekarang: Rp%.2f%n", ownerName, amount, balance);
        } else {
            System.out.println("Jumlah setoran harus lebih besar dari Rp0.");
        }
    }

    public void withdrawMoney(double amount) {
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
                System.out.printf("%s menarik Rp%.2f. Saldo sekarang: Rp%.2f%n", ownerName, amount, balance);
            } else {
                System.out.printf("%s mencoba menarik Rp%.2f. Saldo tidak mencukupi. Saldo saat ini: Rp%.2f%n", ownerName, amount, balance);
            }
        } else {
            System.out.println("Jumlah penarikan harus lebih besar dari Rp0.");
        }
    }
}

