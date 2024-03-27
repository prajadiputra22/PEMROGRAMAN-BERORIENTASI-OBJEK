package shape;

public class Square implements Shape{
    private double sisi;

    public Square(double sisi){
        this.sisi = sisi;
    }

    public double luas(){
        return sisi*sisi;
    }

    public double keliling(){
        return 4 * sisi;
    }

    public void getInfo(){
        System.out.println("Persegi dengan sisi " + sisi);
        System.out.println("Luas: " + luas());
        System.out.println("Keliling: " + keliling());
    }
}
