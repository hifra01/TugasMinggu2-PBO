package pbo.b.nim202410101055;

public class Mahasiswa {
    final String nama;
    final String nim;
    final String prodi;

    Mahasiswa(String nama, String nim, String prodi) {
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
    }
    void perkenalan() {
        System.out.println("Nama saya " + nama + ", NIM " + nim + ", Program Studi " + prodi);
    }
}
