package pbo.b.nim202410101051;


public class main {
    public void main(){
        Mahasiswa siswa = new Mahasiswa("Ardi Yuliantoro", "202410101051", "Sistem Informasi");
        siswa.perkenalan();

        Celcius suhu = new Celcius(30.0);
        suhu.toFarenheit();
        suhu.toKelfin();
        suhu.toReamur();

        BangunRuangKubus kubus = new BangunRuangKubus(10.0);
        kubus.LuasPermukaan();
        kubus.Volume();

    }
}
