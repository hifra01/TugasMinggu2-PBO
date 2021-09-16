package pbo.b.nim202410101140;

public class Mahasiswa {
    final String nama;
    final String NIM;
    final String prodi;

    Mahasiswa(String paramnama, String paramnim, String paramprodi) {
        this.nama = paramnama;
        this.NIM = paramnim;
        this.prodi = paramprodi;
    }
    void intro() {
        System.out.println("Halo, Nama saya " + nama + ", NIM " + NIM + ", Program Studi " + prodi);
    }
}
