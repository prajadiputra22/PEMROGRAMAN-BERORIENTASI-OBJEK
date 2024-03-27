package geometri;
import shape.*;

public class Balok extends Rectangle implements Geometri {
    protected double tinggi;

    public Balok(double panjang, double lebar, double tinggi) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }

    public double volume() {
        return super.luas() * tinggi;
    }

    public double luasPermukaan() {
        return 2 * (super.luas() + (panjang * tinggi) + (lebar * tinggi));
    }

    public void getInfo(){
        System.out.println("\nBalok dengan tinggi " + tinggi + ", panjang " + panjang + ", dan lebar " + lebar);
        System.out.println("Volume: " + volume());
        System.out.println("Luas Permukaan: " + luasPermukaan());
    }
}
