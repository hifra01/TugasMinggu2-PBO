package pbo.b.nim202410101012;

public class mahasiswa {
    String nama;
    String nim;
    String prodi;

    public mahasiswa(String nama, String nim, String prodi)
    {   this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
    }

    String perkenalan()
    {
        return String.format("Halo, nama saya "+nama+", NIM "+nim+", dari prodi "+prodi+".");
    }
}
