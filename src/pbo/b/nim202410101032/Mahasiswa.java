package pbo.b.nim202410101032;

class Mahasiswa {
    String Nama, NIM, Prodi;

    void datamhs(String newNama, String newNIM, String newProdi){
        Nama = newNama;
        NIM = newNIM;
        Prodi = newProdi;
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
        System.out.println("Halo! Nama saya " +newNama.outNama() + ", NIM " +newNama.outNIM() + ", dari Prodi " +newNama.outProdi() +".");
    }
    public static void main(String[]args){
        mhscode();
    }
}