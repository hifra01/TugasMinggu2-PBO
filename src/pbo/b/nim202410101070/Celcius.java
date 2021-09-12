package pbo.b.nim202410101070;

public class Celcius {
    //  property
    double suhu;

    //  method
    public double toFahrenheit() {
        return suhu * (9.0 / 5) + 32;
    }

    public double toKelvin() {
        return suhu + 273.15;
    }

    public double toReamur() {
        return suhu * (4.0 / 5);
    }
}
