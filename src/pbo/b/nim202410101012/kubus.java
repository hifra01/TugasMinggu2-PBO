package pbo.b.nim202410101012;

public class kubus {
    double sisi;

    public kubus(double sisi){
        this.sisi = sisi;
    }
    double luasPermukaan(){
        return(6*sisi*sisi);
    }
    double volume(){
        return(sisi*sisi*sisi);
    }
}
