package geometri;
import shape.*;

public class Kubus extends Square implements Geometri {
    protected double ruas;

    public Kubus(double sisi) {
        super(sisi);
        this.ruas = sisi;
    }

    public double volume() {
        return super.luas() * ruas;
    }

    public double luasPermukaan() {
        return super.luas() * 6;
    }

    public void getInfo(){
        System.out.println("Kubus dengan ruas " + ruas);
        System.out.println("Volume: " + volume());
        System.out.println("Luas Permukaan: " + luasPermukaan());
    }
}
