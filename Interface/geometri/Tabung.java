package geometri;
import shape.*;

public class Tabung extends Circle implements Geometri{
    protected double tinggi;

    public Tabung(double radius, double tinggi){
        super(radius);
        this.tinggi = tinggi;
    }

    public double volume(){
        return keliling() * tinggi;
    }

    public double luasPermukaan(){
        return luas() * tinggi;
    }
}
