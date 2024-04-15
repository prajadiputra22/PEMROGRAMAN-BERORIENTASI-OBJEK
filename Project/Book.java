public class Book {
    private String title;
    private String genre;
    private String author;
    private Integer publication_year;

    public Book(String title, String genre, String author, Integer publication_year) {
        this.title = title;
        this.genre = genre;
        this.author = author;
        this.publication_year = publication_year;
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

    public Integer getPublicationYear() {
        return publication_year;
    }

    public String toString() {
        return
        "\nTitle            : " + title +
        "\nGenre            : " + genre +
        "\nAuthor           : " + author +
        "\nPublication Year : " + publication_year;
    }
}
