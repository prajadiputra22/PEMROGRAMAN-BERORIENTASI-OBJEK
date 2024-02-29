package Tugas3.Triangle;

public class SegitigaSembarang extends Segitiga {
    public SegitigaSembarang(
            double alas,
            double tinggi,
            double sisi1,
            double sisi2,
            double sisi3) {
        super.setName("Segitiga sembarang");
        this.luasSegitigaSembarang(alas, tinggi);
        this.kelilingSegitigaSembarang(sisi1, sisi2, sisi3);
    }

    public void luasSegitigaSembarang(double a, double t) {
        super.luas = a * t * 0.5;
    }

    public void kelilingSegitigaSembarang(double sisi1, double sisi2, double sisi3) {
        super.keliling = sisi1 + sisi2 + sisi3;
    }
}
