package pbo.b.nim202410101002;

public class mahasiswa {
    String nama;
    String nim;
    String prodi;

    public mahasiswa(String nama, String nim, String prodi) {
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
    }

    void mahasiswa() {
        System.out.printf("Hallo, nama saya %s, NIM %s, dari prodi %s", nama, nim, prodi);
    }
}
