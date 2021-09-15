package pbo.b.nim202410101144;

public class Bola {
    double radius;

    Bola(double Radius) {
        this.radius = Radius;
    }

    void luasPermukaan() {
        System.out.println(4 * 22/7d * (Math.pow(radius, 2)));
    }

    void volume() {
        System.out.println(4/3d * 22/7d * (Math.pow(radius, 3)));
    }
}
