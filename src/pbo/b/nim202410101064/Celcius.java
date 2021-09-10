package pbo.b.nim202410101064;

public class Celcius {
    double suhu;

    Celcius(double suhu) {
        this.suhu = suhu;
    }

    double toFahrenheit() {
        return 9.0 / 5 * suhu + 32;
    }

    double toKelvin() {
        return suhu + 273;
    }

    double toReamur() {
        return 4.0 / 5 * suhu;
    }

}
