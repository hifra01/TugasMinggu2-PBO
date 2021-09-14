package pbo.b.nim202410101019;

public class Main {
    public static void main(String[] args) {
        Mahasiswa data = new Mahasiswa("Annisa Wulandari", "202410101019", "Sistem Informasi");
        data.perkenalan();

        Celcius clcs = new Celcius(30);
        clcs.toFahrenheit();
        clcs.toKelvin();
        clcs.toReamur();

        BangunRuangBalok balok = new BangunRuangBalok(8, 4, 6);
        balok.luasPermukaan();
        balok.volume();
    }
}
