package pbo.b.nim202410101107;

public class ClassMahasiswa {
    String Nama;
    String NIM;
    String ProgramStudi;

    public ClassMahasiswa(String Nama, String NIM, String ProgramStudi) {
        this.Nama = Nama;
        this.NIM = NIM;
        this.ProgramStudi = ProgramStudi;
    }
    String Nama(){
        return Nama;
    }
    String NIM(){
        return NIM;
    }
    String ProgramStudi(){
        return ProgramStudi;
    }
}
class mainClassMahasiswa {
    public static void main(String[] args) {
        ClassMahasiswa Mahasiswa1 = new ClassMahasiswa("Revina Hani Rahmadilla", "202410101107", "Sistem Informasi");

        System.out.println(Mahasiswa1.Nama);
        System.out.println(Mahasiswa1.NIM);
        System.out.println(Mahasiswa1.ProgramStudi);
    }
}