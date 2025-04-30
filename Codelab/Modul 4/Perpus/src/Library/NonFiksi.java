package Library;

// Subclass Library.NonFiksi
public class NonFiksi extends Buku {
    private String field;

    public NonFiksi(String title, String author, String field) {
        super(title, author);
        this.field = field;
    }

    @Override
    public void displayInfo() {
        System.out.println("Library.Buku Non-Library.Fiksi: " + title + " oleh " + author + " (Bidang: " + field + ")");
    }
}
