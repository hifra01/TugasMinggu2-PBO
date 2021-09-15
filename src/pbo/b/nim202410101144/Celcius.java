package pbo.b.nim202410101144;

public class Celcius {
    double suhu;

    Celcius(double Suhu) {
        this.suhu = Suhu;
    }

    void toFahrenheit() {
        System.out.println((suhu - 32) * 5/9);
    }

    void toKelvin() {
        System.out.println(suhu - 273);
    }

    void toReamur() {
        System.out.println(suhu * 5/4);
    }
}
