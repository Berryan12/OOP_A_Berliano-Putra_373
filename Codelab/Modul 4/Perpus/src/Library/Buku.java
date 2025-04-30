package Library;

// Abstract class Library.Buku
public abstract class Buku {
    protected String title;
    protected String author;

    public Buku(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public abstract void displayInfo();
}
