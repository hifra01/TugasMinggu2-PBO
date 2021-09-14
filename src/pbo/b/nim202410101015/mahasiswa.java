package pbo.b.nim202410101015;

public class mahasiswa{
    String nama, nim, prodi;

    public mahasiswa(String nama, String nim, String prodi){
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
    }
    
    void setperkenalan(){
        System.out.print("Halo nama saya " + nama + ", ");
        System.out.print("NIM " + nim + ", ");
        System.out.print("dari prodi " + prodi);
    }
}