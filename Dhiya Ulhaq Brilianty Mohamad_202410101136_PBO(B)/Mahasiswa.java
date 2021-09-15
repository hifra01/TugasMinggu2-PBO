package pbo.b.nim202410101136;

public class Mahasiswa {
    String nama, nim, prodi;

    public Mahasiswa(String Nama, String NIM, String Prodi){
        nama = Nama;
        nim = NIM;
        prodi = Prodi;
    }
    public void Mahasiswa(){
        System.out.println("Halo, nama saya " + nama + ", NIM " + nim + ", dari program studi " + prodi);
    }
}
