package pbo.b.nim202410101081;

public class Mahasiswa {
    String nama;
    long nim;
    String prodi;

    public Mahasiswa(String nama, long nim, String prodi) {
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
    }

    String perkenalan() {
        return "Halo nama saya " + nama + ", NIM " + nim + ", dari prodi " + prodi;
    }
}
