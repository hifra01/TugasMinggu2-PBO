package pbo.b.nim202410101095;

public class main {
    public static void main(String[] args) {

        mahasiswa siswa = new mahasiswa();
        siswa.nama = ("Sella Eka safitri");
        siswa.nim = ("202410101095");
        siswa.prodi = ("Sistem Informasi");
        siswa.perkenalan();
    
        celcius suhu = new celcius(27);
        suhu.toFahrenheit();
        suhu.toKelvin();
        suhu.toReamur();

        bangunRuang rumus_kubus = new bangunRuang(6);
        rumus_kubus.LuasPermukaan();
        rumus_kubus.Volume();
    }
}
