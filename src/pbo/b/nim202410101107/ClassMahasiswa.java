package pbo.b.nim202410101107;

public class ClassMahasiswa {
    String Nama;
    String NIM;
    String ProgramStudi;

    void Mahasiswa(String NamaBaru, String NIMBaru, String ProgramStudibaru){
        Nama = NamaBaru;
        NIM = NIMBaru;
        ProgramStudi = ProgramStudibaru;
    }
    String outNama(){
        return Nama;
    }
    String outNIM(){
        return NIM;
    }
    String outProdi(){
        return Prodi;
    }
}

class mainMahasiswa{
    public static void mhscode(){
        Mahasiswa newNama = new Mahasiswa();
        newNama.datamhs("Widyarista Nariswari","202410101032", "Sistem Informasi");
        System.out.println("Halo, Nama saya " +newNama.outNama() + ", NIM " +newNama.outNIM() + ", dari Prodi " +newNama.outProdi() +".");
    }
    public static void main(String[]args){
        mhscode();
    }
}
