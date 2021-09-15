package pbo.b.nim202410101125;

public class Main {
    public static void main(String[] args) {
        Mahasiswa id = new Mahasiswa("Haniva Naina Zein", "Sistem Informasi", "202410101125");
        id.perkenalan();

        System.out.println("=================================================");
        Celcius C = new Celcius(100f);
        C.toFahrenheit();
        C.toKelvin();
        C.toReamur();

        System.out.println("=================================================");
        Balok balok = new Balok(35, 10, 20);
        balok.luasPermukaan();
        balok.volume();
    }
}
