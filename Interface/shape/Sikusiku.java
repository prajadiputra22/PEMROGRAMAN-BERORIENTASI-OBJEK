package shape;

public class Sikusiku extends Triangle {
    protected double alas;
    protected double tinggi;

    public Sikusiku (double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
        super.setName("Segitiga Siku-Siku");
    }

    public double luas() {
        return alas*tinggi/2;
    }

    public double keliling() {
        double sm = Math.sqrt(alas*alas + tinggi*tinggi);
        return sm + alas + tinggi;
    }
}
