package pbo.b.nim202410101055;

public class Celcius {
    private double celcius;

    Celcius(double celcius) {
        this.celcius = celcius;
    }
    double to_Fahrenheit() {
        return (celcius * (9/5F)) + 32;
    }
    double to_Kelvin() {
        return (celcius + 273.15);
    }
    double to_Reamur() {
        return (celcius * 4/5);
    }

    public static void main(String[] args) {

    }
}
