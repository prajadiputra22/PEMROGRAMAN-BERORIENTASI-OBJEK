package shape;

public class Rectangle implements Shape {
    public double panjang;
    public double lebar;

    public Rectangle(double panjang, double lebar){
        this.panjang = panjang;
        this.lebar = lebar;
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