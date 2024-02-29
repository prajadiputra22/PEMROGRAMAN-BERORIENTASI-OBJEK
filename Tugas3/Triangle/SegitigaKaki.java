package Tugas3.Triangle;

public class SegitigaKaki extends Segitiga {
    public SegitigaKaki (double alas, double tinggi){
        super.setName("Segitiga sama kaki");
        this.luasSegitigaSamaKaki(alas,tinggi);
        this.kelilingSegitigaSamaKaki(alas);
    }

    public void luasSegitigaSamaKaki(double a, double t) {
        super.luas = a * t * 0.5;
    }
    public void kelilingSegitigaSamaKaki(double a) {
        super.keliling = a * 3;
    }
}