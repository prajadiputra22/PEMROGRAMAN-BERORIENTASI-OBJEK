import java.util.List; // Import List class
import java.util.Scanner;

public class LibraryApp {
    private static Scanner scanner = new Scanner(System.in);
    private static Library library = new Library();

    public static void main(String[] args) {
        boolean exit = false;
        while (!exit) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Search Book");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    viewBooks();
                    break;
                case 3:
                    searchBook();
                    break;
                case 4:
                    exit = true;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
        scanner.close();
    }

    private static void addBook() {
        System.out.print("\nTitle: ");
        String title = scanner.nextLine();
        System.out.print("Genre: ");
        String genre = scanner.nextLine();
        System.out.print("Author: ");
        String author = scanner.nextLine();
        System.out.print("Publisher Year: ");
        Integer tahun = scanner.nextInt();

        Book book = new Book(title, genre, author, tahun);
        library.addBook(book);
        System.out.println("Book added successfully!");
    }

    private static void viewBooks() {
        library.displayBooks();
    }

    private static void searchBook() {
        System.out.println("Search Options:");
        System.out.println("1. Search by Title");
        System.out.println("2. Search by Genre");
        System.out.println("3. Search by Author");
        System.out.print("Enter your choice: ");
        int searchChoice = scanner.nextInt();
        scanner.nextLine(); 

        switch (searchChoice) {
            case 1:
                System.out.print("\nEnter title to search: ");
                String title = scanner.nextLine();
                System.out.println("Search results by title:");
                displaySearchResults(library.searchByTitle(title));
                break;
            case 2:
                System.out.print("Enter genre to search: ");
                String genre = scanner.nextLine();
                System.out.println("Search results by genre:");
                displaySearchResults(library.searchByGenre(genre));
                break;
            case 3:
                System.out.print("Enter author to search: ");
                String author = scanner.nextLine();
                System.out.println("Search results by author:");
                displaySearchResults(library.searchByAuthor(author));
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }

    private static void displaySearchResults(List<Book> books) {
        if (books.isEmpty()) {
            System.out.println("No matching books found.");
        } else {
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }
}
