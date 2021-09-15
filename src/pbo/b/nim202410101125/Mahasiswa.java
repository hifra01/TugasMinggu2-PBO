package pbo.b.nim202410101125;

public class Mahasiswa {
    //property
    String nama, nim, prodi;

    //constructor
    public Mahasiswa(String newNama, String newProdi, String newNim){
        nama = newNama;
        prodi = newProdi;
        nim = newNim;
    }
    public void perkenalan(){
        System.out.println("Halo, nama saya "+nama+", NIM "+nim+", dari prodi "+prodi);
    }
}
