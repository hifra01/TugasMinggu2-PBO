package pbo.b.nim202410101064;

public class Mahasiswa {
    String nama, NIM, prodi;

    Mahasiswa(String nama, String NIM, String prodi) {
        this.nama = nama;
        this.NIM = NIM;
        this.prodi = prodi;
    }

    String perkenalan() {
        return String.format("Halo, nama saya %s, NIM %s, dari prodi %s.", this.nama, NIM, prodi);
    }
}
