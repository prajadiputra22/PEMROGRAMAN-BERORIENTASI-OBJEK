package Tugas4;

public class App {
    public static void main(String[] args) {
        Lingkaran lingkaran = new Lingkaran(7);
        lingkaran.getInfo();

        Persegi persegi = new Persegi(5);
        persegi.getInfo();

        Segitiga.SegitigaSikuSiku sikuSiku = new Segitiga.SegitigaSikuSiku(2, 5);
        Segitiga.SegitigaSamaKaki samaKaki = new Segitiga.SegitigaSamaKaki(4, 5);
        Segitiga.SegitigaSamaSisi samaSisi = new Segitiga.SegitigaSamaSisi(5);
        Segitiga.SegitigaSembarang sembarang = new Segitiga.SegitigaSembarang(4, 5, 6);
        
        sikuSiku.getInfo();
        samaKaki.getInfo();
        samaSisi.getInfo();
        sembarang.getInfo();
    }
}