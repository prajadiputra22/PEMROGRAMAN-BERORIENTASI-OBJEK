package Tugas4;

public class BangunDatar {
    protected double luas;
    protected double keliling;
    protected String nama;

    public double getLuas(){
        return this.luas;
    }
    public double getKeliling(){
        return this.keliling;
    }
    public String getName(){
        return this.nama;
    }
    public void setName(String name){
        this.nama = name;
    }
    public void getInfo(){
        System.out.println("\nNama : " + this.nama);
        System.out.println("Luas : " + this.luas);
        System.out.println("Keliling : " + this.keliling);
    }
}
