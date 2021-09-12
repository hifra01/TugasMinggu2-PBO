package pbo.b.nim202410101036;

public class Celcius {
    public double c;

    double toFahrenheit(){
        return c * 1.8 + 32;
        }

    double toKelvin(){
        return c+273.15;
        }

    double toReamur(){
        return c*0.8;
        }
}
