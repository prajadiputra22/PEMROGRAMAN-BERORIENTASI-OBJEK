public class Book {
    private String title;
    private String genre;
    private String author;
    private Integer tahun_terbit;

    public Book(String title, String genre, String author, Integer tahun_terbit) {
        this.title = title;
        this.genre = genre;
        this.author = author;
        this.tahun_terbit = tahun_terbit;
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

    public Integer getPublisher() {
        return tahun_terbit;
    }

    public String toString() {
        return
        "\nTitle            : " + title +
        "\nGenre            : " + genre +
        "\nAuthor           : " + author +
        "\nTahun Terbit     : " + tahun_terbit;
    }
}
