package pbo.b.nim202410101106;

class Mahasiswa {
    String Nama, NIM, Prodi;

    public void identitas(String Nama1, String NIM1, String Prodi1){
        Nama = Nama1;
        NIM = NIM1;
        Prodi = Prodi1;
    }

    String OutputNama() {return Nama;}
    String OutputNIM() {return NIM;}
    String OutputProdi() {return Prodi;}
}

class mainmahasiswa{
    public static void Mahasiswa_Code(){
        Mahasiswa Nama1 = new Mahasiswa();
        Nama1.identitas("Tahta Nimas Putri Rahayu", "202410101106", "Sistem Informasi");

        System.out.println("Halo, nama saya "+Nama1.OutputNama() + ", NIM "+Nama1.OutputNIM() + ", dari prodi "+Nama1.OutputProdi() +".");
    }
    public static void main(String[]args){
        Mahasiswa_Code();
    }
}