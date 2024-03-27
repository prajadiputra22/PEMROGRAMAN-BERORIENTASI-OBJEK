package shape;

public class Sembarang extends Triangle{
    protected double sisiA;
    protected double sisiB;
    protected double sisiC;

    public Sembarang(double sisiA, double sisiB, double sisiC) {
        this.sisiA = sisiA;
        this.sisiB = sisiB;
        this.sisiC = sisiC;
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
