package pbo.b.nim202410101011;

public class mahasiswa {
    // property
    String nama;
    String nim;
    String prodi;
    // constructor
    public mahasiswa(String nama, String nim, String prodi) {
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
    }

    // method
    public String perkenalan(){
        return String.format("Halo, nama saya" + " " +nama+ ", NIM " + nim + ", dari prodi"+" " + prodi+ ".");
    }
}
