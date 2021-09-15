package pbo.b.nim202410101118;

public class Main {
    public static void main(String[] args){
        Mahasiswa unej = new Mahasiswa("Muhammad Amirul Mukminin, ","202410101118, ","Sistem Informasi.");
        unej.perkenalan();

        
        Celcius derajat = new Celcius(4);
        derajat.toFahrenheit();
        derajat.toKelvin();
        derajat.toReamur();

 
        BangunRuangTabung brt = new BangunRuangTabung(3,5);
        brt.luasPermukaan();
        brt.Volume();
    }
}