package App;

import Library.*;

public class Main {
    public static void main(String[] args) {
        Buku fiksi = new Fiksi("Hainuwele: Sang Putri Kelapa", "Lilis Hu", "Dongeng");
        Buku nonFiksi = new NonFiksi("Madilog", "Tan Malaka", "Sejarah & Ilmu Pengetahuan");

        fiksi.displayInfo();
        nonFiksi.displayInfo();

        Anggota anggota1 = new Anggota("Berliano Putra", "A373");
        Anggota anggota2 = new Anggota("Park Ji-hyo", "A432");

        anggota1.borrowBook(nonFiksi);
        anggota2.borrowBook("Hainuwele: Sang Putri Kelapa", 7);

        anggota1.returnBook(nonFiksi);
        anggota2.returnBook(fiksi);
    }
}



