public class Book {
    private String title;
    private String genre;
    private String author;
    private Integer tahunTerbit;

    public Book(String title, String genre, String author, Integer tahunTerbit) {
        this.title = title;
        this.genre = genre;
        this.author = author;
        this.tahunTerbit = tahunTerbit;
    }

    // Getter methods
    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public String getAuthor() {
        return author;
    }

    public Integer gettahunTerbit() {
        return tahunTerbit;
    }

    public String toString() {
        return
        "\nTitle            : " + title +
        "\nGenre            : " + genre +
        "\nAuthor           : " + author +
        "\nPublication Year : " + tahunTerbit;
    }
}
