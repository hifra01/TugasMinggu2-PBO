package pbo.b.nim202410101125;

public class Balok {
    int panjang, lebar, tinggi, luaspermukaan, volume;

    public Balok(int newPanjang, int newLebar, int newTinggi){
        panjang = newPanjang;
        lebar = newLebar;
        tinggi = newTinggi;
    }
    void luasPermukaan(){
        luaspermukaan = 2 * (panjang*lebar + panjang*tinggi + lebar*tinggi);
        System.out.println("Luas permukaan balok = "+luaspermukaan+" cm2");
    }
    void volume(){
        volume = panjang * lebar * tinggi;
        System.out.println("Volume balok = "+volume+" cm3");
    }
}
