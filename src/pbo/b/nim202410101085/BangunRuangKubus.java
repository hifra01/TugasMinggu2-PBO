package pbo.b.nim202410101085;

public class BangunRuangKubus{
    int Sisi;

    public void setSisi(int sisiKubus){
        Sisi = sisiKubus;
    }

    int LuasPermukaan(){
        return (6 * Sisi * Sisi);
    }

    int Volume(){
        return (Sisi * Sisi * Sisi);
    }

    public String gabung2(){
        return "Luas Permukaan: " + LuasPermukaan() + " Volume: " + Volume();
    }
}