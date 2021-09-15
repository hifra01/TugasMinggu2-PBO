package pbo.b.nim202410101109;

public class Mahasiswa {
    String Nama;
    String Nim;
    String Prodi;

    public Mahasiswa(String ParamNama, String ParamNim, String ParamProdi)
    {
        Nama = ParamNama;
        Nim = ParamNim;
        Prodi = ParamProdi;
    }

    public void setNama(String paramNama) {
        Nama = paramNama;
    }
    public void setNim(String paramNim) {
        Nim = paramNim;
    }
    public void setProdi(String paramProdi) {
        Prodi = paramProdi;
    }

    public String getNama(){
        return Nama;
    }
    public String getNim(){
        return Nim;
    }
    public String getProdi(){
        return Prodi;
    }

    public void Mahasiswa() {
        System.out.println("Halo, nama saya" + " " + Nama + " NIM" + " " + Nim + " dari prodi" + " " + Prodi);
    }
}