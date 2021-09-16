package pbo.b.nim202410101085;

class Mahasiswa{
    String Nama;
    String NIM;
    String Prodi;

    void setNama(String namaMahasiswa){
        Nama = namaMahasiswa;
    }

    void setNIM(String nimMahasiswa){
        NIM = nimMahasiswa;
    }

    void setProdi(String prodiMahasiswa){
        Prodi = prodiMahasiswa;
    }

    public String mhsNama(){
        return Nama;
    }

    public String mhsNIM(){
        return NIM;
    }

    public String mhsProdi(){
        return Prodi;
    }

    public String gabung(){
        return "Halo, Nama saya " + Nama + ", NIM " + NIM + ", dari prodi " + Prodi;
    }
}