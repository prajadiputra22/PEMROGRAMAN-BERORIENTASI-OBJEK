package Tugas1;

import java.util.Scanner;

public class Segitiga {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Hitung Luas dan Keliling Segitiga Sembarang ===");

        System.out.print("Masukan panjang sisi A segitiga : ");
        double a = scanner.nextDouble();

        System.out.print("Masukan panjang sisi B segitiga : ");
        double b = scanner.nextDouble();

        System.out.print("Masukan panjang sisi C segitiga : ");
        double c= scanner.nextDouble();

        System.out.print("Masukan panjang alas segitiga : ");
        double alas = scanner.nextDouble();

        System.out.print("Masukan tinggi segitiga : ");
        double tinggi = scanner.nextDouble();

        double keliling = a + b + c;
        double luas = alas * tinggi / 2;

        System.out.println("Keliling Segitiga : "+keliling+ " cm");
        System.out.println("Luas segita : " + luas + " cm");

        scanner.close();
    }
}
