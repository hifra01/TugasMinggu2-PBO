package pbo.b.nim202410101081;

public class Main {

    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa("Varrel Dwitantio Purwadiansyah", 202410101081L, "Sistem Informasi");
        System.out.println(mahasiswa1.perkenalan());

        Celcius celcius1 = new Celcius(25);
        System.out.println(celcius1.toFahrenheit());
        System.out.println(celcius1.toKelvin());
        System.out.println(celcius1.toReamur());

        BangunRuang kubus1 = new BangunRuang(4);
        System.out.println(kubus1.luasPermukaan());
        System.out.println(kubus1.volume());
    }
}
