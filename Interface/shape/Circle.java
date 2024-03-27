package shape;

public class Circle implements Shape{
    public double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double luas(){
        return Math.PI * radius * radius;
    }

    public double keliling(){
        return 2 *  Math.PI * radius;
    }

    public void getInfo(){
        System.out.println("\nLingkaran dengan jari-jari " + radius);
        System.out.printf("Luas: %.2f\n", luas());
        System.out.printf("Keliling: %.2f\n", keliling());
    }
}
