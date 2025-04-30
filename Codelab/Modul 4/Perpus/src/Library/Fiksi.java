package Library;

// Subclass Library.Fiksi
public class Fiksi extends Buku {
    private String genre;

    public Fiksi(String title, String author, String genre) {
        super(title, author);
        this.genre = genre;
    }

    @Override
    public void displayInfo() {
        System.out.println("Library.Buku Library.Fiksi: " + title + " oleh " + author + " (Genre: " + genre + ")");
    }
}