package pbo.b.nim202410101081;

public class Celcius {
    float suhu;

    public Celcius(float suhu) {
        this.suhu = suhu;
    }

    float toFahrenheit() {
        float fahrenheit = (float) 9/5 * suhu + 32;
        return fahrenheit;
    }

    float toKelvin() {
        float kelvin = suhu + 273;
        return kelvin;
    }

    float toReamur() {
        float reamur = (float) 4/5 * suhu;
        return reamur;
    }
}
