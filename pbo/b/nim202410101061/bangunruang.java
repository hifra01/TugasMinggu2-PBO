package pbo.b.nim202410101061;

public class bangunruang {
    int panjang;
    int lebar;
    int tinggi;

    public void setPanjang(int newpanjang){panjang = newpanjang;}
    public void setLebar(int newlebar){lebar = newlebar;}
    public void setTinggi(int newtinggi){tinggi = newtinggi;}

    int luaspermukaanbalok(){
        return 2*(panjang*lebar + panjang*tinggi + lebar*tinggi);
    }
    int volumebalok(){
        return panjang*lebar*tinggi;
    }

    public String tostring2(){
        return "Luas permukaan balok =  " + luaspermukaanbalok() + " , Volume balok =  " + volumebalok();
    }

}
