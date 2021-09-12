package pbo.b.nim202410101051;


public class main {
    public static void main(String[] args){
        Mahasiswa siswa = new Mahasiswa("Ardi Yuliantoro", "202410101051", "Sistem Informasi");
        System.out.println(siswa.perkenalan());

        Celcius suhu = new Celcius(30.0);
        System.out.printf("%nCelcius ke Farenheit: %.2f F %n", suhu.toFarenheit());
        System.out.printf("Celcius ke Kelfin: %.2f K %n", suhu.toKelfin());
        System.out.printf("Celcius ke Reamur: %.2f R %n", suhu.toReamur());

        BangunRuangKubus kubus = new BangunRuangKubus(10.0);
        System.out.printf("%nLuas permukaan kubus: %.2f satuan%n", kubus.luasPermukaan());
        System.out.printf("Volume bangun ruang kubus: %.2f satuan", kubus.volume());

    }
}
