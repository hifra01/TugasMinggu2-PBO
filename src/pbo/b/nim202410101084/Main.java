package pbo.b.nim202410101084;

public class Main {
    public static void main(String[] args) {
        //Mahasiswa
        Mahasiswa mahasiswa1 = new Mahasiswa("Erlin Nuriya Safitri", "202410101084", "Sistem Informasi");
        System.out.println("====================================================================================");
        mahasiswa1.perkenalan();

        //Celcius
        Celcius celcius1 = new Celcius(36);
        System.out.println("====================================================================================");
        celcius1.toFahrenheit();

        //BangunRuang
        BangunRuang bangunRuang1 = new BangunRuang(6, 3, 4);
        System.out.println("====================================================================================");
        bangunRuang1.volume();
        System.out.println("====================================================================================");
    }
}