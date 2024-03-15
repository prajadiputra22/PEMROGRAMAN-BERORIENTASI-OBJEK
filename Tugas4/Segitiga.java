package Tugas4;

public class Segitiga extends BangunDatar {

    protected double sisiA;
    protected double sisiB;
    protected double sisiC;

    public Segitiga(double a, double b, double c) {
        this.sisiA = a;
        this.sisiB = b;
        this.sisiC = c;
        this.hitungLuas();
        this.hitungKeliling();
        super.setName("Segitiga");
    }

    public void hitungLuas() {
        double s = (sisiA + sisiB + sisiC) / 2;
        this.luas = Math.sqrt(s * (s - sisiA) * (s - sisiB) * (s - sisiC));
    }

    public void hitungKeliling() {
        this.keliling = sisiA + sisiB + sisiC;
    }
}

class SegitigaSikuSiku extends Segitiga {
    public SegitigaSikuSiku(double alas, double tinggi) {
        super(alas, tinggi, Math.sqrt(alas * alas + tinggi * tinggi));
        super.setName("Segitiga Siku-Siku");
    }
}

class SegitigaSamaKaki extends Segitiga {
    public SegitigaSamaKaki(double alas, double tinggi) {
        super(alas, tinggi, tinggi);
        super.setName("Segitiga Sama Kaki");
    }
}

class SegitigaSamaSisi extends Segitiga {
    public SegitigaSamaSisi(double sisi) {
        super(sisi, sisi, sisi);
        super.setName("Segitiga Sama Sisi");
    }
}

class SegitigaSembarang extends Segitiga {
    public SegitigaSembarang(double sisiA, double sisiB, double sisiC) {
        super(sisiA, sisiB, sisiC);
        super.setName("Segitiga Sembarang");
    }
}