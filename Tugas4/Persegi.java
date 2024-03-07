package Tugas4;

public class Persegi extends BangunDatar {
    public Persegi(double s) {
        super.setName("Persegi");
        this.LuasPersegi(s);
        this.KelilingPersegi(s);
    }

    public void LuasPersegi(double s) {
        super.luas = s * s;
    }

    public void KelilingPersegi(double s) {
        super.keliling = s * 4;
    }
}
