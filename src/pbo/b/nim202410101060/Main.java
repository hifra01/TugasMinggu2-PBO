package pbo.b.nim202410101060;

public class Main {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa("Sebastian Gavin Haryaka", "202410101060", "Sistem Informasi");
        mhs.perkenalan();

        Celcius celcius = new Celcius(50);
        celcius.toFahrenheit();
        celcius.toKelvin();
        celcius.toReamur();

        BangunRuang bg = new BangunRuang(10);
        bg.luasPermukaan();
        bg.volume();
    }
}
