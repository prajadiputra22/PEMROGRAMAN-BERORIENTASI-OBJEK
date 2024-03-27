package shape;

public class Sembarang extends Triangle{
    public Sembarang(double sisiA, double sisiB, double sisiC) {
        super(sisiA, sisiB, sisiC);
        super.setName("Segitiga Sembarang");
    }

    public double luas() {
        double s = (sisiA + sisiB + sisiC) / 2;
        return Math.sqrt(s * (s - sisiA) * (s - sisiB) * (s - sisiC));
    }

    public double keliling() {
        return sisiA + sisiB + sisiC;
    }
}
