package geometri;
import shape.*;

public class Bola extends Circle implements Geometri {
    protected double radius;

    public Bola(double radius){
        super(radius);
        this.radius = radius;
    }

    public double volume(){
        return 4/3 * luas() * radius;
    }

    public double luasPermukaan(){
        return 4 * luas();
    }

    public void getInfo(){
        System.out.println("\nBola dengan radius " + radius);
        System.out.printf("Volume: %.2f\n", volume());
        System.out.printf("Luas permukaan: %.2f\n", luasPermukaan());
    }
}
