package pbo.b.nim202410101123;

public class Mahasiswa {
    //Atribut / Property
    String nama;
    String nim;
    String prodi;

    //Method
    String perkenalan() {
        return "Halo, nama saya " + nama + ", NIM " + nim + ", dari prodi " + prodi;
    }

    //Construstor
    Mahasiswa(String nama, String nim, String prodi){
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
    }
}