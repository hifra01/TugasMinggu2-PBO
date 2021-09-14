package pbo.b.nim202410101082;

public class Mahasiswa {
    String nama;
    String nim;
    String prodi;

    public Mahasiswa(String nama, String nim, String prodi){
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
    }

    public String toString(){
        return "Halo, nama saya " + nama + " nim " + nim + " prodi " + prodi;
    }
}
