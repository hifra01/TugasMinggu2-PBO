package pbo.b.nim202410101030;

public class Mahasiswa{

//    property
    String Nama, Prodi, NIM;

//    constructor
    public Mahasiswa(String Nama, String Prodi, String NIM){
        this.Nama = Nama;
        this.Prodi = Prodi;
        this.NIM = NIM;
    }

//    Method
    void perkenalan(){System.out.println("Halo, nama saya " + Nama + " NIM " + NIM + " dari prodi " + Prodi);}



}
