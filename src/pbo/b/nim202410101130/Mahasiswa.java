package pbo.b.nim202410101130;

public class Mahasiswa {
    String nama,nim,prodi;

    public Mahasiswa(String nama, String nim, String prodi) {
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
    }
    public String toString(){
        return "Halo, nama saya " + nama + ", NIM "+ nim + ", dari prodi "+ prodi+" " ;
    }

}
