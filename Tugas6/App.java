import bangundatar.*;
import shape.*;

public class App {
    public static void main(String[] args) {
        Persegi A = new Persegi(5);
        PersegiPanjang B = new PersegiPanjang(4, 5);
        Square C = new Square(6);

        C.print();
        A.getInfo();
        B.getInfo();
        C.setPaper();
    }
}
