package pbo.b.nim202410101018;

public class Mahasiswa {
    String nama;
    long nim;
    String prodi;
    //    constructor
    Mahasiswa (String namaMhsw, long nimMhsw, String prodiMhsw) {
        nama = namaMhsw;
        nim = nimMhsw;
        prodi = prodiMhsw;
    }
    //    method untuk menampilkan value
    void perkenalan() {
        System.out.print("Halo, nama saya " + nama + ", NIM " + nim +", dari prodi " + prodi + ".");
    }
}
