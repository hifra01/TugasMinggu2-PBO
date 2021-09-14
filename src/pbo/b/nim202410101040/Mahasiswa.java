package pbo.b.nim202410101040;

public class Mahasiswa {
    
    String nama, nim, prodi;

    public Mahasiswa(String nama, String nim, String prodi) {
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
    }

    void dataDiri() {
        System.out.printf("Halo, nama saya %s, NIM %s, dari prodi %s", nama, nim, prodi);
    }
}

