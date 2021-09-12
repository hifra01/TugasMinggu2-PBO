package pbo.b.nim202410101070;

public class Bola {
    //  property
    double r;

    //  method
    public double luasPermukaan() {
        return 4 * Math.PI * r * r;
    }

    public double volume() {
        return (4.0 / 3) * Math.PI * r * r;
    }
}
