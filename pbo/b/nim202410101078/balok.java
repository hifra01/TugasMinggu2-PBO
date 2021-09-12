package pbo.b.nim202410101078;

public class balok {
    double panjang;
    double lebar;
    double tinggi;


    public balok(double panjang, double lebar, double tinggi){
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    double hitungLuasPermukaan(){
        return (2 * ((panjang*lebar) + (lebar*tinggi) + (panjang*tinggi)));
    }

    double hitungVolume(){
        return (panjang*lebar*tinggi);
    }
}
