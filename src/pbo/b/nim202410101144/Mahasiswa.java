package pbo.b.nim202410101144;

public class Mahasiswa {
    String nama;
    Long nim;
    String prodi;

    Mahasiswa (String Nama, Long NIM, String Prodi) {
        this.nama = Nama;
        this.nim = NIM;
        this.prodi = Prodi;
    }

    void intro() {
        System.out.println("Halo, nama saya " + nama + ", NIM " + nim + ", dari prodi " + prodi);
    }
}
