package pbo.b.nim202410101119;

public class Mahasiswa {
    String Nama, NIM, Prodi;

    // constructor
    public Mahasiswa(String Nama, String NIM, String Prodi) {
        this.Nama = Nama; this.NIM = NIM; this.Prodi = Prodi;
    }

    String Perkenalan() {
        return String.format("Halo, nama saya" + Nama + "NIM" +  NIM + "prodi" + Prodi);
    }
}
