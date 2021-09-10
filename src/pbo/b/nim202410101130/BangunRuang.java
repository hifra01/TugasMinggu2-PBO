package pbo.b.nim202410101130;

public class BangunRuang {
    double jarijari;
    double tinggi;
    double panjang;

    public BangunRuang(double newjarijari, double newtinggi) {
        jarijari = newjarijari;
        tinggi = newtinggi;
    }
    public double getVolumeBangun() {
        return (1.0/3.0) *Math.PI * jarijari *jarijari * tinggi;
    }
    public double getLuasBangun() {
        panjang = Math.sqrt(jarijari * jarijari + tinggi * tinggi);
        return Math.PI * jarijari * (panjang + jarijari);
    }
}