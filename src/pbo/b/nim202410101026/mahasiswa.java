package pbo.b.nim202410101026;

public class mahasiswa {
    String nama,nim,prodi;

    public mahasiswa(String nama, String nim, String prodi) {
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
    }
    public String toString(){
        return "Halo, nama saya " + nama + ", NIM "+ nim + ", dari prodi "+ prodi+" " ;
    }
}
