package pbo.b.nim202410101002;

public class celcius {
    double suhu;

    public celcius(double suhu) {
        this.suhu = suhu;
    }

    public double toFahrenheit() {
        return (suhu*9/5)+32;
    }

    public double toKelvin() {
        return suhu+273.15;
    }

    public double toReamur() {
        return suhu*4*5;
    }
}