package TugasLooping;

import java.util.Scanner;

public class Book {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Books[] books = new Books[3];
        books[0] = new Books("Darmawan", "Jiwa Yang Teriak Dalam Kegelapan", 30000.00, 1);
        books[1] = new Books("Kaka", "Indahnya Kesensdirian", 40000.00, 2);
        books[2] = new Books("Prajadiputra", "Jiwa Yang Terluka", 50000.00, 3);

        for (Books book : books) {
            String informasi = book.informasi();
            System.out.println("\nInformasi buku " + informasi);
        }

        double totalPrice = 0;

        for (Books book : books) {
            System.out.print("Masukkan jumlah buku " + book.getAuthor() + " yang ingin dibeli: ");
            int jumlahBuku = scanner.nextInt();
            totalPrice += book.calculateBooks(jumlahBuku);
        }

        System.out.println("\nTotal pembelian buku : Rp." + totalPrice + '\n');

        scanner.close();
    }
}

class Books {
    private String author;
    private String title;
    private double price;
    private int publisher_number;

    public Books(String author, String title, double price, int publisher_number) {
        this.author = author;
        this.title = title;
        this.price = price;
        this.publisher_number = publisher_number;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getTitle() {
        return this.title;
    }

    public double getPrice() {
        return this.price;
    }

    public int getPublisher_number() {
        return this.publisher_number;
    }

    public double calculateBooks(int jumlahBuku) {
        return jumlahBuku * this.price;
    }

    public String informasi() {
        return '\n' +
                "author          : " + author + '\n' +
                "title           : " + title + '\n' +
                "price           : " + price + '\n' +
                "publisherNumber : " + publisher_number + '\n';
    }
}
