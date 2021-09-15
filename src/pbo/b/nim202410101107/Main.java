package pbo.b.nim202410101107;

public class Main {
    public static void main(String[] args) {
        // Mahasiswa
        ClassMahasiswa Mahasiswa1 = new ClassMahasiswa("Revina Hani Rahmadilla", "202410101107", "Sistem Informasi");

        System.out.println(Mahasiswa1.Nama);
        System.out.println(Mahasiswa1.NIM);
        System.out.println(Mahasiswa1.ProgramStudi);
        // BangunRuangTabung
        BangunRuangTabung Tabung1 = new BangunRuangTabung(7,15);

        double LuasPermukaan = Tabung1.LuasPermukaan();
        double Volume = Tabung1.Volume();

        System.out.println("Luas Permukaan dan Volume Tabung");
        System.out.println("================================");
        System.out.println("Luas Permukaan Tabung adalah : " + Tabung1.LuasPermukaan() + " cm2");
        System.out.println("Volume Tabung adalah : " + Tabung1.Volume() + " cm3");
        System.out.println();

        // CelciusFarenheit
        System.out.println("CELCIUS");
        CelciusFarenheit Celcius1 = new CelciusFarenheit(78);

        System.out.println("Derajat Farenheit adalah : " + Celcius1.ToFarenheit() + " F");
        System.out.println("Derajat Kelvin adalah : " + Celcius1.ToKelvin() + " K");
        System.out.println("Derajat Reamur adalah : " + Celcius1.ToReamur() + "R");




    }
}

