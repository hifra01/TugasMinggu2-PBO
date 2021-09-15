package pbo.b.nim202410101009;


// class mahasiswa
class Mahasiswa {
    String nama, nim, prodi;


    // constructor
    public Mahasiswa (String nama, String nim, String prodi) {
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
    }


    // method
    void perkenalan() {

        System.out.println("Halo, nama saya " + nama + ", NIM " + nim + ", dari prodi " + prodi);
    }
}