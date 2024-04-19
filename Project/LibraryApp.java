import java.util.List; 
import java.util.Scanner;

public class LibraryApp {
    private static Scanner scanner = new Scanner(System.in);
    private static Library library = new Library();

    public static void main(String[] args) {
        boolean exit = false;
        while (!exit) {
            System.out.println("\nSISTEM MANAJEMEN PERPUSTAKAAN");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Lihat Buku");
            System.out.println("3. Pencarian");
            System.out.println("4. Exit");
            System.out.print("Pilihan: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (pilihan) {
                case 1:
                    tambahBuku();
                    break;
                case 2:
                    lihatBuku();
                    break;
                case 3:
                    pencarian();
                    break;
                case 4:
                    exit = true;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid pilihan, please try again.");
            }
        }
        scanner.close();
    }

    private static void tambahBuku() {
        System.out.print("\nTitle: ");
        String title = scanner.nextLine();
        System.out.print("Genre: ");
        String genre = scanner.nextLine();
        System.out.print("Author: ");
        String author = scanner.nextLine();
        System.out.print("Tahun Terbit: ");
        Integer tahun_terbit = scanner.nextInt();

        Book book = new Book(title, genre, author, tahun_terbit);
        library.tambahBuku(book);
        System.out.println("Buku berhasil ditambahkan!");
    }

    private static void lihatBuku() {
        library.displayBooks();
    }

    private static void pencarian() {
        System.out.println("\nPilihan Pencarian:");
        System.out.println("1. By Title");
        System.out.println("2. By Genre");
        System.out.println("3. By Author");
        System.out.print("Pilihan: ");
        int searchChoice = scanner.nextInt();
        scanner.nextLine();

        switch (searchChoice) {
            case 1:
                System.out.print("\nMasukan Title: ");
                String title = scanner.nextLine();
                System.out.println("Hasil Pencarian:");
                displaySearchResults(library.ByTitle(title));
                break;
            case 2:
                System.out.print("\nMasukan Genre: ");
                String genre = scanner.nextLine();
                System.out.println("Hasil Pencarian:");
                displaySearchResults(library.ByGenre(genre));
                break;
            case 3:
                System.out.print("\nMasukan Author: ");
                String author = scanner.nextLine();
                System.out.println("Hasil Pencarian:");
                displaySearchResults(library.ByAuthor(author));
                break;
            default:
                System.out.println("Pilihan salah.");
        }
    }

    private static void displaySearchResults(List<Book> books) {
        if (books.isEmpty()) {
            System.out.println("Buku tidak ditemukan.");
        } else {
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }
}
