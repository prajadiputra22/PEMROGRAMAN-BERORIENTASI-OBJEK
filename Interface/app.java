import shape.*;
import geometri.*;

public class app {
    public static void main(String[] args) {
        System.out.println("==========SHAPE==========");
        Square Persegi = new Square(6);
        Rectangle PersegiPanjang = new Rectangle(7,5);
        Circle Lingkaran = new Circle(8);
        SamaKaki SamaKaki = new SamaKaki(7, 5);
        SamaSisi SamaSisi = new SamaSisi(5);
        Sikusiku Sikusiku = new Sikusiku(5, 7);
        Sembarang Sembarang = new Sembarang(5, 6, 7);
        
        Persegi.getInfo();
        PersegiPanjang.getInfo();
        Lingkaran.getInfo();
        SamaKaki.getInfo();
        SamaSisi.getInfo();
        Sikusiku.getInfo();
        Sembarang.getInfo();
        System.out.println("============================");
        
        System.out.println("\n==========GEOMETRI==========");
        Kubus Kubus = new Kubus(4);
        Balok Balok = new Balok(5,6, 7);
        Bola Bola = new Bola(7);
        Tabung Tabung = new Tabung(8, 7);
        
        Kubus.getInfo();
        Balok.getInfo();
        Bola.getInfo();
        Tabung.getInfo();
        System.out.println("============================");   
    }
}
