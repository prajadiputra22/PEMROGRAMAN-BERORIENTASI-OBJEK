package Tugas4;

public class Lingkaran extends BangunDatar{
    public Lingkaran(double r){
        super.setName("Lingkaran");
        this.Luas(r);
        this.Keliling(r);
    }

    public void Luas(double r){
        super.luas = 3.14 * r * r;
    }
    public void Keliling(double r){
        super.keliling = 2 * 3.14 * r;
    }
}
