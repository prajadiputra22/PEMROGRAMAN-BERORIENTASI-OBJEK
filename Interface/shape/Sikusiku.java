package shape;

public class Sikusiku extends Triangle {

    public Sikusiku (double alas, double tinggi) {
        super(alas, tinggi, Math.sqrt(alas * alas + tinggi * tinggi));
        super.setName("Segitiga Siku-Siku");
    }

    public double luas() {
        double s = (sisiA + sisiB + sisiC) / 2;
        return Math.sqrt(s * (s - sisiA) * (s - sisiB) * (s - sisiC));
    }

    public double keliling() {
        return sisiA + sisiB + sisiC;
    }
}
