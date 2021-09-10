package pbo.b.nim202410101064;

public class Tabung {
    double radius;
    double height;

    Tabung(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    double luasPermukaan() {
        return 2 * Math.PI * radius * (radius + height);
    }

    double volume() {
        return Math.PI * radius * radius * height;
    }
}
