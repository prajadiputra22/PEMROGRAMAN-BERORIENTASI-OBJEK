package Tugas2;

public class Segitiga {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(10, 5);

        // triangle.setAlas(4);
        // triangle.setTinggi(5);
        // triangle.setLuas();

        int hasil = triangle.getLuas();
        System.out.println("Hasil dari luas segitga adalah : " + hasil);
    }
}

class Triangle {

    private int alas;
    private int tinggi;

    // CONSTRUCTOR
    public Triangle(int alas, int tinggi) {
        this.tinggi = tinggi;
        this.alas = alas;
    }

    // SETTER
    // public void setAlas (int value) {
    // this.alas = value;
    // }

    public void setTinggi(int value) {
        this.tinggi = value;
    }

    // public void setLuas () {
    // int luas = this.alas * this.tinggi / 2;
    // System.out.println(luas);
    // }

    // GETTER
    public int getLuas() {
        return this.alas * this.tinggi / 2;
    }
}
