package pbo.b.nim202410101078;

public class mahasiswa {
    String nama;
    String nim;
    String prodi;

//    constructor
    public mahasiswa(String nama, String prodi,String nim){
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
    }


    String perkenalan () {
        return String.format("Halo, nama saya" + " " + nama + " " + "NIM" + " " + nim + " " + "dari prodi" + " " + prodi);
    }
}