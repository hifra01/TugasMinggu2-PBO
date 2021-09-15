package pbo.b.nim202410101055;

public class BangunRuang {
    private double length;
    private double wide;
    private double height;

    BangunRuang(double length, double wide, double height) {
        this.length = length;
        this.wide = wide;
        this.height = height;
    }
    public double getLength() {
        return length;
    }
    public double getWide() {
        return wide;
    }
    public double getHeight() {
        return height;
    }
    double surface() {
        return (2 * (length * wide) + 2 * (length * height) + 2 * (wide * height));
    }
    double volume() {
        return ((length * wide) * height);
    }
    double total_length_side() {
        return ((length + wide + height) * 4);
    }
    public static void main(String[] args) {

    }
}
