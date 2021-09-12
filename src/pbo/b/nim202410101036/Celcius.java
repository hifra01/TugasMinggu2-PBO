package pbo.b.nim202410101036;

public class Celcius {
    public double c, f, k, r;

    public void toFahrenheit() {
        f = c * 1.8 + 32;
        System.out.println("Fahrenheit : " + f);
        }

    public void toKelvin(){
        k = c+273.15;
        System.out.println("Kelvin     : " + k);
        }

    public void toReamur(){
        r = c*0.8;
        System.out.println("Reaumur    : " + r);
        }
}
