public class EBook extends Book {
    private String format;

    public EBook(String title, String genre, String author, Integer tahun_terbit, String format) {
        super(title, genre, author, tahun_terbit);
        this.format = format;
    }

    public String getFormat() {
        return format;
    }

    @Override
    public String toString() {
        return super.toString() + ", Format: " + format;
    }
}
