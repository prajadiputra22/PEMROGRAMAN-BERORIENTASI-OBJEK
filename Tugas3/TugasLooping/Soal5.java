package Tugas3.TugasLooping;

public class Soal5 {
    public static void main(String[] args) {
        int angka = 1;
        int langkah = 2;

        for (int i = 1; i <= 8; i ++) {
            System.out.print(angka + " ");

            angka += langkah;
            langkah++;
        }
    }
}
