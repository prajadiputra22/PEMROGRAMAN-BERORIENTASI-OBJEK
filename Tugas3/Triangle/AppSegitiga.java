package Tugas3.Triangle;


public class AppSegitiga {
    public static void main(String[] args) {

        SegitigaKaki segitigaKaki = new SegitigaKaki(4, 5);
        segitigaKaki.getInfo();

        SegitigaSisi segitigaSisi = new SegitigaSisi(6,4);
        segitigaSisi.getInfo();

        SegitigaSembarang segitigaSembarang = new SegitigaSembarang(4,7,5,8,7);
        segitigaSembarang.getInfo();
    }
    
}