package pbo.b.nim202410101060;

public class Mahasiswa {
    String nama, nim, prodi;
    public Mahasiswa (String nama, String nim, String prodi) {
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
    }
    void perkenalan (){ System.out.println ("Halo, nama saya " + nama + ", NIM " + nim + ", dari prodi " + prodi + "\n"); }
}