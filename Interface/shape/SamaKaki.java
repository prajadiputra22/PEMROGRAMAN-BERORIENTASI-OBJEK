package shape;

public class SamaKaki extends Triangle{
    public SamaKaki (double alas, double tinggi) {
        super(alas, tinggi, tinggi);
        super.setName("Segitiga Sama Kaki");
    }

    public double luas() {
        double s = (sisiA + sisiB + sisiC) / 2;
        return Math.sqrt(s * (s - sisiA) * (s - sisiB) * (s - sisiC));
    }

    public double keliling() {
        return sisiA + sisiB + sisiC;
    }
}
