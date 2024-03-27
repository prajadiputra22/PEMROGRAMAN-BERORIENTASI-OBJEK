package shape;

public abstract class Triangle{
    public abstract double luas();
    public abstract double keliling();
    public String name;

    public void setName(String name){
        this.name = name;
    }
    
    public void getInfo() {
        System.out.println("\n" + name);
        System.out.printf("Luas: %.2f\n", luas());
        System.out.printf("Keliling: %.2f\n", keliling());
    }
}
