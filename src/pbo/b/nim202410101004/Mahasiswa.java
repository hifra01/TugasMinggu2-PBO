package pbo.b.nim202410101004;

public class Mahasiswa {

    // Atribut
    String nama;
    String NIM;
    String prodi;

    // constructor
    public Mahasiswa(String Nama, String NIM, String Prodi) {
        this.nama = Nama; 
        this.NIM = NIM; 
        this.prodi = Prodi;
    }

    // method
    String Perkenalan() {
        return String.format("Halo, nama saya" + nama + "NIM" +  NIM + "prodi" + prodi);
    }
}
