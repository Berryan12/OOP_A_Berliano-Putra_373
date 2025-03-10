class BankAccount {
    String accountNumber;
    String ownerName;
    double balance;

    BankAccount(String accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    void displayInfo() {
        System.out.println("Nama Pemilik: " + ownerName);
        System.out.println("Nomor Rekening: " + accountNumber);
        System.out.println("Saldo: Rp" + balance);
    }

    void depositMoney(double amount) {
        balance += amount;
        System.out.println("Menambah menyetor Rp" + amount + ". (Berhasil) Saldo sekarang: Rp" + balance);
    }

    void withdrawMoney(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Menarik Rp" + amount + ". (Berhasil) Saldo sekarang: Rp" + balance);
        } else {
            System.out.println("Menarik Rp" + amount + ". (Gagal) Saldo tidak mencukupi.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Your NIM", "Your name", 100000.0);
        BankAccount account2 = new BankAccount("Your friend's NIM", "Your friend's name", 150000.0);

        account1.displayInfo();
        account1.depositMoney(200000.0);
        account1.withdrawMoney(50000.0);

        System.out.println();

        account2.displayInfo();
        account2.depositMoney(100000.0);
        account2.withdrawMoney(70000.0);
    }
}
