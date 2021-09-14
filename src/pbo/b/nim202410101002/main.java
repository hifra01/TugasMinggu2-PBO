package pbo.b.nim202410101002;

public class main {
    public static void main(String[] args) {
        mahasiswa mahasiswa1 = new mahasiswa("Nindi Fenestiyan Rahman", "202410101002", "Sistem Informasi\n\n");
//      menjalankan method
        mahasiswa1.mahasiswa();

        bangunRuang bangunRuang1 = new bangunRuang(4, 2, 5);
//      menjalankan method
        System.out.println("luas balok adalah: " + bangunRuang1.LuasBalok() + "cm persegi");
        System.out.println("volume balok adalah: " +bangunRuang1.volumeBalok() + "cm kubik\n");

        celcius celcius1 = new celcius( 36);
//      menjalankan method
        System.out.println("konversi dari celcius ke fahrenheit yaitu: " + celcius1.toFahrenheit() );
        System.out.println("konversi dari celcius ke kelvin yaitu: " + celcius1.toKelvin() );
        System.out.println("konversi dari celcius ke reamur yaitu: " + celcius1.toReamur() );
    }
}
