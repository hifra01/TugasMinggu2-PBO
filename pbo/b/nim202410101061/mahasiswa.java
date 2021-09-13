package pbo.b.nim202410101061;

public class mahasiswa {
    String nama;
    String nim;
    String prodi;

    public void setNama(String nama1){nama = nama1;}
    public void setNim(String nim1){nim = nim1;}
    public void setProdi(String prodi1){prodi = prodi1;}

    public String getNama(){return nama;}
    public String getNim(){return nim;}
    public String getProdi(){return prodi;}

    public String tostring(){
        return "hallo, nama saya " + nama + " NIM " + nim  + " prodi " + prodi;
    }
}
