package pbo.b.nim202410101084;

public class Celcius {
    double suhu;

    Celcius(double suhu) {
        this.suhu = suhu;
    }

    void toFahrenheit() {
        double fahrenheit, kelvin, reamur;
        fahrenheit = (suhu*9/5)+32;
        kelvin = suhu+273.15;
        reamur = suhu*4/5;

        System.out.println(">> Celsius = " + suhu);
        System.out.println(">> Fahrenheit = " + fahrenheit);
        System.out.println(">> Kelvin = " + kelvin);
        System.out.println(">> Reamur = " + reamur);
    }
}