package pbo.b.nim202410101070;

public class Mahasiswa {
    //  property
    String nama, nim, prodi;

    //  constructor
    public Mahasiswa(String nama, String nim, String prodi) {
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
    }

    //  method
    public String perkenalan() {
        return String.format("Halo, nama saya %s, NIM %s, dari prodi %s.", nama, nim, prodi);
    }
}
