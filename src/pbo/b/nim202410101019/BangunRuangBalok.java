package pbo.b.nim202410101019;

public class BangunRuangBalok {
    float panjang, lebar, tinggi;

    public BangunRuangBalok(float panjang, float lebar, float tinggi){
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    void luasPermukaan(){
        System.out.println(2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi)) + " cm persegi");
    }

    void volume(){
        System.out.println(panjang * lebar * tinggi + " cm kubik");
    }
}
