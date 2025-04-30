package Library;


public class Anggota implements BookLoan {
    private String name;
    private String memberID;

    public Anggota(String name, String memberID) {
        this.name = name;
        this.memberID = memberID;
        System.out.println("Anggota: " + name + " (ID: " + memberID + ")");
    }

    @Override
    public void borrowBook(Buku book) {
        System.out.println(name + " meminjam buku berjudul: " + book.title);
    }

    // Overloaded method
    public void borrowBook(String title, int duration) {
        System.out.println(name + " meminjam buku \"" + title + "\" selama " + duration + " hari.");
    }

    @Override
    public void returnBook(Buku book) {
        System.out.println(name + " mengembalikan buku berjudul: " + book.title);
    }
}