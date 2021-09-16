package pbo.b.nim202410101081;

public class BangunRuang {
    float sisi;

    public BangunRuang(float sisi) {
        this.sisi = sisi;
    }

    float luasPermukaan() {
        return 6 * (sisi * sisi);
    }

    float volume() {
        return sisi * sisi * sisi;
    }
}
