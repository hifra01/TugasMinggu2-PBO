package pbo.b.nim202410101063;

public class mahasiswa {
    String nama;
    String NIM;
    String Prodi;

    //contructor
    public mahasiswa(String nama, String NIM, String Prodi){
        this.nama = nama;
        this.NIM = NIM;
        this.Prodi = Prodi;
    }

    String getNama(){
        return this.nama;
    }

    String getNIM(){
        return this.NIM;
    }

    String getProdi(){
        return this.Prodi;
    }

    public void perkenalan(){
        System.out.println("Halo, nama saya "+getNama()+ ", NIM "+getNIM()+ ", Prodi "+getProdi());
    }

}
