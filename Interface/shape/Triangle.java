package shape;

public abstract class Triangle{
    public abstract double luas();
    public abstract double keliling();

    public double sisiA;
    public double sisiB;
    public double sisiC;
    public String name;

    public Triangle (double a, double b, double c) {
        this.sisiA = a;
        this.sisiB = b;
        this.sisiC = c;
    }

    public void setName(String name){
        this.name = name;
    }
    
    public void getInfo() {
        System.out.println("\nNama: " + name);
        System.out.printf("Luas: %.2f\n", luas());
        System.out.printf("Keliling: %.2f\n", keliling());
    }
}
