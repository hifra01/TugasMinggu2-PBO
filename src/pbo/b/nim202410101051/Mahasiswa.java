package pbo.b.nim202410101051;

public class Mahasiswa {
    String nama, nim, prodi;

    Mahasiswa(String nama, String nim, String prodi){
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
    }

    void perkenalan(){
        System.out.printf("Hallo, nama saya %s, NIM %s, dari prodi %s %n", nama, nim, prodi);
    }
}