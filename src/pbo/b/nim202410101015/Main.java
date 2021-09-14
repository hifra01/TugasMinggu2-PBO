package pbo.b.nim202410101015;

public class Main {
    public static void main(String[] args) {
        mahasiswa SI = new mahasiswa("Rina Agustin" , "202410101015" , "Sistem Informasi");
        SI.setperkenalan();

        celcius C = new celcius(45);
        C.toFahrenheit();
        C.toKelvin();
        C.toReamur();

        bangunRuang BR = new bangunRuang(7, 8);
        BR.setLuaspermukaan();
        BR.setVolumetabung();
    }
}