package geometri;
import shape.*;

public class Tabung extends Circle implements Geometri{
    protected double tinggi;

    public Tabung(double radius, double tinggi){
        super(radius);
        this.tinggi = tinggi;
    }

    public double volume(){
        return luas() * tinggi;
    }

    public double luasPermukaan(){
        return keliling() * (radius+tinggi);
    }

    public void getInfo(){
        System.out.println("\nTabung dengan radius " + radius + " dan tinggi " + tinggi);
        System.out.printf("Volume: %.2f\n", volume());
        System.out.printf("Luas permukaan: %.2f\n", luasPermukaan());
    }

}
