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

