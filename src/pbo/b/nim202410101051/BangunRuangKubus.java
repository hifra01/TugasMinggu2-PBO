package pbo.b.nim202410101051;

public class BangunRuangKubus {
    double sisi;

    BangunRuangKubus(double sisi){

        this.sisi = sisi;
    }

    double luasPermukaan(){
        return 6 * sisi * sisi;

    }

    double volume() {
        return sisi * sisi * sisi;
    }

}
