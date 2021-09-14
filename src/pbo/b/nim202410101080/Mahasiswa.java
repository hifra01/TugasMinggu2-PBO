package pbo.b.nim202410101080;

import java.math.BigInteger;

/*
* Class Mahasiswa:
Memiliki property nama, nim, prodi
Memiliki method perkenalan yang mengembalikan kalimat "Halo, nama saya <nama>, NIM <nim>, dari prodi <prodi>."
* */
public class Mahasiswa {
    final String nama;
    final long nim;
    final String prodi;

    Mahasiswa(String nama,
              long nim,
              String prodi
    ) {
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;

    }
    void perkenalan (){
        System.out.println("Halo, nama saya "+nama+ ", NIM " +nim+ ", dari prodi "+prodi+".");
    }


}
