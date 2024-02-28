package Tugas2;

import java.util.Scanner;

public class Book {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Books book1 = new Books("Darmawan", "Jiwa Yang Teriak Dalam Kegelapan", 30000.00, 1);
        Books book2 = new Books("Kaka", "Indahnya Kesensdirian", 40000.00, 2);
        Books book3 = new Books("Prajadiputra", "Jiwa Yang Terluka", 50000.00, 3);

        String informasi1 = book1.informasi();
        System.out.println("\nInformasi buku " + informasi1);

        String informasi2 = book2.informasi();
        System.out.println(informasi2);

        String informasi3 = book3.informasi();
        System.out.println(informasi3);

        System.out.print("Masukkan jumlah buku Darmawan yang ingin dibeli: ");
        int jumlahBuku1 = scanner.nextInt();

        System.out.print("Masukkan jumlah buku Kaka yang ingin dibeli: ");
        int jumlahBuku2 = scanner.nextInt();

        System.out.print("Masukkan jumlah buku Prajadiputra yang ingin dibeli: ");
        int jumlahBuku3 = scanner.nextInt();

        double totalPrice = book1.calculateBooks(jumlahBuku1) + book2.calculateBooks(jumlahBuku2) + book3.calculateBooks(jumlahBuku3);
        System.out.println("\n Total pembelian buku : Rp." + totalPrice + '\n');

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