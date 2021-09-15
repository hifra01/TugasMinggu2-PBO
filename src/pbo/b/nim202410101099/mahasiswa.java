package pbo.b.nim202410101099;

class mahasiswa{
    String nama, nim, prodi;

    public void setNama(String paranama){
        nama = paranama;
    }
    public void setNIM(String paranim) {
        nim = paranim;
    }
    public void setProdi(String paraprodi) {
        prodi = paraprodi;
    }

    public String getNama(){return nama;}
    public String getNIM(){return nim;}
    public String getProdi(){return prodi;}
    public String tostring(){
        return "Halo, nama saya " + nama + ", NIM " + nim + ", dari prodi " + prodi + ".";
    }
}