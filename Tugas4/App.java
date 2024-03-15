package Tugas4;

public class App {
    public static void main(String[] args) {
        Lingkaran lingkaran = new Lingkaran(7);
        lingkaran.getInfo();

        Persegi persegi = new Persegi(5);
        persegi.getInfo();

        SegitigaSikuSiku sikuSiku = new SegitigaSikuSiku(2, 5);
        SegitigaSamaKaki samaKaki = new SegitigaSamaKaki(4, 5);
        SegitigaSamaSisi samaSisi = new SegitigaSamaSisi(5);
        SegitigaSembarang sembarang = new SegitigaSembarang(4, 5, 6);

        sikuSiku.getInfo();
        samaKaki.getInfo();
        samaSisi.getInfo();
        sembarang.getInfo();
    }
}