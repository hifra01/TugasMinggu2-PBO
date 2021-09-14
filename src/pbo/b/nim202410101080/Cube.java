package pbo.b.nim202410101080;

public class Cube {
    private double side_leght;
    Cube(double side_leght){this.side_leght= side_leght;}

    public double getSide_leght() {
        return side_leght;
    }

    double surface_area(){
        return (side_leght * side_leght)*6;
    }
    double volume(){
        return side_leght*side_leght*side_leght;
    }
    public static void main(String[] args) {

    }
}

