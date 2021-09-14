package pbo.b.nim202410101063;

public class bangunRuang {
    //Bangun Ruang Balok
    private int panjang;
    private int lebar;
    private int tinggi;

    //contructor
    public bangunRuang(int panjang, int lebar, int tinggi){
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    int getPanjang(){
        return this.panjang;
    }

    void setPanjang(int newPanjang){
        this.panjang = newPanjang;
    }

    int getLebar(){
        return this.lebar;
    }

    void setLebar(int newLebar){
        this.lebar = newLebar;
    }

    int getTinggi(){
        return this.tinggi;
    }

    void setTinggi(int newTinggi){
        this.tinggi = newTinggi;
    }

    int getVolume(){
        return (this.panjang * this.lebar * this.tinggi);
    }

    int getluasPermukaan(){
        return (2 * (this.panjang + this.lebar)+ 2 * (this.panjang + this.tinggi)+ 2 * (this.lebar + this.tinggi));
    }


}
