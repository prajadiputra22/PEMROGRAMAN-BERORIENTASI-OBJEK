package shape;

public class SamaSisi extends Triangle{
    public SamaSisi (double sisi) {
        super(sisi, sisi, sisi);
        super.setName("Segitiga Sama Sisi");
    }

    public double luas() {
        double s = (sisiA + sisiB + sisiC) / 2;
        return Math.sqrt(s * (s - sisiA) * (s - sisiB) * (s - sisiC));
    }

    public double keliling() {
        return sisiA + sisiB + sisiC;
    }
}
