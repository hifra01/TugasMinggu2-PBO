package pbo.b.nim202410101031;

public class Main {
    public static void main(String[] args) {
        mahasiswa introduce = new mahasiswa("Risya Mauriza, ","202410101031, ","Sistem Informasi.");
        introduce.perkenalan();

        
        celcius termometer = new celcius(26);
        termometer.toFahrenheit();
        termometer.toKelvin();
        termometer.toReamur();

 
        bangunRuangKubus rumus = new bangunRuangKubus(7);
        rumus.luasPermukaan();
        rumus.Volume();
    }
}