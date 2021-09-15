package pbo.b.nim202410101123;

public class BangunRuang {
    //Atribut / Property
    double sisi;

    //Method
    double luasPermukaan(){
        return 6*sisi*sisi;
    }

    double volume(){
        return sisi*sisi*sisi;
    }

    //Constructor
    BangunRuang(double sisi){
        this.sisi = sisi;
    }
}