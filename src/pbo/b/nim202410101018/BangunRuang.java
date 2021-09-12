package pbo.b.nim202410101018;

public class BangunRuang {
    double phi = 3.14;
    double jariJari;
    double tinggi;
    double hasil;

    public double luasPermukaan (double r, double t) {
        hasil = 2 * phi * r * (r + t);
        return hasil;
    }
    public double volume (double r, double t) {
        hasil = phi * r * r * t;
        return hasil;
    }
}
