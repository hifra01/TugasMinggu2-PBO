package pbo.b.nim202410101014;
class Mahasiswa1{
    String nama, nim, prodi;
    //method
    public void setIdentitas(String newNama, String newNim, String newProdi){
        nama = newNama;
        nim = newNim;
        prodi = newProdi;
    }
    String readNama(){
        return nama;
    }
    String readNim(){
        return nim;
    }
    String readProdi(){
        return prodi;
    }
}


