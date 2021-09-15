package pbo.b.nim202410101106;

import java.lang.Math;

class BangunRuang {
    int Tinggi, Jari_Jari;
    public BangunRuang (){
        this.Tinggi = 36;
        this.Jari_Jari = 10;
    }
    double OutputVolume() {
        return Math.PI * Jari_Jari * Jari_Jari * Tinggi;
    }
    double OutputLuasPermukaan() {
        return (2 * Math.PI * Jari_Jari * Tinggi ) + (2 * Math.PI * Jari_Jari * Jari_Jari);
    }
}

class mainbangunruang{
    public static void main(String[]args){
        BangunRuang Tabung = new BangunRuang();

        System.out.println("-------------------------------------------------------");
        System.out.println("PROGRAM MENGHITUNG LUAS PERMUKAAN & VOLUME BANGUN RUANG");
        System.out.println("-------------------------------------------------------");
        System.out.println("Tabung dengan tinggi: "+Tabung.Tinggi +" cm & jari-jari: "+Tabung.Jari_Jari +" cm, memiliki");
        System.out.println("Luas Permukaan Tabung: "+Tabung.OutputLuasPermukaan()+ " cm2");
        System.out.println("Volume Tabung: "+Tabung.OutputVolume()+ " cm3");
    }
}