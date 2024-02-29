package Tugas3.Triangle;

public class SegitigaSisi extends Segitiga {
    public SegitigaSisi (double alas, double tinggi){
        super.setName("Segitiga sama sisi");
        this.luasSegitigaSamaSisi(alas,tinggi);
        this.kelilingSegitigaSamaSisi(alas);
    }

    public void luasSegitigaSamaSisi(double a, double t) {
        super.luas = a * t * 0.5;
    }
    public void kelilingSegitigaSamaSisi(double a) {
        super.keliling = a * 3;
    }
}