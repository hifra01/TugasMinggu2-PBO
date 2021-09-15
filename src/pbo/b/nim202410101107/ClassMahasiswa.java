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
