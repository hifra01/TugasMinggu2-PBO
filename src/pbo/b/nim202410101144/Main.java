package pbo.b.nim202410101144;

public class Main {
    public static void main(String[] args) {
        Mahasiswa Ghozi = new Mahasiswa("Ghozi Dhiya Ulhaq", 202410101144L, "Sistem Informasi");
        Ghozi.intro();
        Celcius suhu = new Celcius(300);
        suhu.toFahrenheit();
        suhu.toKelvin();
        suhu.toReamur();
        Bola sphere = new Bola(7);
        sphere.luasPermukaan();
        sphere.volume();
    }
}
