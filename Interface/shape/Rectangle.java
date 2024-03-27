package shape;

public class Rectangle implements Shape {
    private double panjang;
    private double lebar;

    public Rectangle(double panjang, double lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public double lebar(){
        return lebar;
    }
    public double panjang(){
        return panjang;
    }
    
    public double luas(){
        return panjang * lebar;
    }

    public double keliling(){
        return 2 * (panjang+lebar);
    }

    public void getInfo(){
        System.out.println("\nPersegi Panjang dengan panjang " + panjang + " dan lebar " + lebar);
        System.out.println("Luas: " + luas());
        System.out.println("Keliling: " + keliling());
    }
}