package pbo.b.nim202410101009;

public class Main {
    public static void main (String [] args) {
        System.out.println();
        Mahasiswa Mahasiswa1 = new Mahasiswa ("Elvira Kurlina", "202410101009", "Sistem Informasi");
        Mahasiswa1.perkenalan();


        System.out.println();
        Celcius Celcius1 = new Celcius (100F);
        Celcius1.toFahrenheit();
        Celcius1.toKelvin();
        Celcius1.toReamur();


        System.out.println();
        Balok Balok1 = new Balok (18, 8, 9);
        Balok1.luas();
        Balok1.volume();
    }
}