package pbo.b.nim202410101118;

public class BangunRuangTabung{
    float jarijari, tinggi;

    public BangunRuangTabung(float jarijari, float tinggi){
        this.jarijari = jarijari;
        this.tinggi = tinggi;
    }

    void luasPermukaan(){
        System.out.println(2 * 3.14 * jarijari * (jarijari + tinggi) + " cm persegi");
    }

    void Volume(){
        System.out.println(3.14 * jarijari * jarijari * tinggi + " cm kubik");
    }
}