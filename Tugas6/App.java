import bangundatar.*;
import shape.*;

public class App {
    public static void main(String[] args) {
        Persegi A = new Persegi(5);
        Square B = new Square(6);

        B.print();
        A.getInfo();
        B.getInfo();
        B.setPaper();
    }
}
