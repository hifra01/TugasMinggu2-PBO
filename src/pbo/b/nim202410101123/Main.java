package pbo.b.nim202410101123;

public class Main {
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa("Achmad Azka Muaffan Sutomo Putra", "202410101123", "Sistem Informasi"+".");
        System.out.println(mahasiswa1.perkenalan());

        Celcius suhu1 = new Celcius(100);
        System.out.println("Konversi ke Fahreinhet = " + suhu1.toFahreinheit());
        System.out.println("Konversi ke Kelvin = " + suhu1.toKelvin());
        System.out.println("Konversi ke Reamur = " + suhu1.toReamur());

        BangunRuang bangunRuang1 = new BangunRuang(7);
        System.out.println("Luas Permukaan Kubus = " + bangunRuang1.luasPermukaan());
        System.out.println("Volume Kubus = " + bangunRuang1.volume());

    }
}
