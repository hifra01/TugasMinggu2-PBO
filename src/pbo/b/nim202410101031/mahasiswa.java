package pbo.b.nim202410101031;


public class mahasiswa {
    String Nama;
    String NIM;
    String Prodi;

    public mahasiswa(String nama, String nim, String prodi){
        this.Nama = nama;
        this.NIM = nim;
        this.Prodi = prodi;
    }

    void perkenalan(){
        System.out.println("Hallo, nama saya " + Nama + "NIM " + NIM + "dari prodi " + Prodi);
    }
}