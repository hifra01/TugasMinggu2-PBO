package pbo.b.nim202410101109;

public class BangunRuangPersegi {
    int sisi;
    int LuasPermukaan;
    int Volume;

    public BangunRuangPersegi(int sisi){
        this.sisi = sisi;
        this.LuasPermukaan = hitungLuasPermukaan();
        this.Volume = hitungVolume();
    }

    int hitungLuasPermukaan() {
        return 6 * sisi * sisi;
    }
    int hitungVolume() {
        return sisi * sisi * sisi;
    }
}