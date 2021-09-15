package pbo.b.nim202410101107;

public class BangunRuangTabung {
    // Bangun Ruang Tabung

    int JariJariAlas;
    int TinggiTabung;

    // Contractor (satu fungsi yang memanggil objek)
    public BangunRuangTabung (int JariJariAlas, int TinggiTabung){
        this.JariJariAlas = JariJariAlas;
        this.TinggiTabung = TinggiTabung;
    }
    // Luas Permukaan Tabung

    double LuasPermukaan;
    double LuasPermukaan(){
        return ((2 * 3.14 * JariJariAlas * (JariJariAlas + TinggiTabung)));
    }
    // Volume Tabung

    double Volume;
    double Volume(){
        return ((3.14 * JariJariAlas * JariJariAlas * TinggiTabung));
    }
}
class mainBangunRuangTabung{
    public static void main(String[]args){
        BangunRuangTabung Tabung1 = new BangunRuangTabung(7,15);

        double LuasPermukaan = Tabung1.LuasPermukaan;
        double Volume = Tabung1.Volume;

        System.out.println("Luas Permukaan dan Volume Tabung");
        System.out.println("================================");
        System.out.println("Luas Permukaan Tabung adalah : " + Tabung1.LuasPermukaan() + " cm2");
        System.out.println("Volume Tabung adalah : " + Tabung1.Volume() + " cm3");

    }
}
