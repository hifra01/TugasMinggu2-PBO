public class mahasiswa {
    String nama, prodi, nim;

    mahasiswa(String nama, String prodi, String nim){
        this.nama = nama;
        this.prodi = prodi;
        this.nim = nim;
    }

    void perkenalan(){
        System.out.println("Halo, nama saya " + nama + ", NIM " + nim + ", dari prodi " + prodi);
    }
}
