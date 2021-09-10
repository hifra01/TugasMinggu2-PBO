package pbo.b.nim202410101051;

public class BangunRuangKubus {
    double sisi;

    BangunRuangKubus(double sisi){
        this.sisi = sisi;
    }

    void LuasPermukaan(){
        double luasPermukaan = 6 * sisi * sisi;
        System.out.printf("%nLuas permukaan kubus = %.2f satuan%n", luasPermukaan);
    }

    void Volume() {
        double volume = sisi * sisi * sisi;
        System.out.printf("Volume kubus = %.2f satuan", volume);
    }

}
