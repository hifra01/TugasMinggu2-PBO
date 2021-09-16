package pbo.b.nim202410101138;

public class Mahasiswa {
    private String nim;
    private String nama;
    private String nilai;

    public Mahasiswa(String Paramnim, String Paramnama, String Paramnilai) {
        nim = Paramnim;
        nama = Paramnama;
        nilai = Paramnilai;
    }

    public String getNama() {
        return nama;
    }
    public String getNim() {
        return nim;
    }
    public String getNilai() {
        return nilai;
    }

    public void setNama(String newNama) {
        this.nama = newNama;
    }
    public void setNilai(String newNilai) {
        this.nilai = newNilai;
    }
    public void setNim(String newNim) {
        this.nim = newNim;
    }

    public void Mahasiswa(){
        System.out.println("NIM" + " " + nim + " " + "Nama Mahasiswa" + " " + nama + " " + "Nilai" + " " + nilai);
    }
}

