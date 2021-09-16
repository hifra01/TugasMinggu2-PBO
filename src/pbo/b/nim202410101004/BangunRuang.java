package pbo.b.nim202410101004;

public class BangunRuang {
        // Attribute
    double phi = 3.14;
    double jari2, tinggi, luasalastabung, kelilingdindingtabung, luasdindingtabung, volumetabung;

        // contructor
    public void setJarijari(double parajarijari){
        jari2 = parajarijari;
    } 

    public void settinggi(double paratinggi){
        tinggi = paratinggi;
    }

    public double luasalastabung () {return 2 * phi * jari2;}  

    public double kelilingdindingtabung () {return 2 * ( tinggi + ( 2 * phi * jari2 ));}

    public double luasdindingtabung () {return 2 +luasalastabung + ( tinggi * 2 * phi * jari2);}

    public double volumetabung () {return (luasalastabung * tinggi);}
}



