package pbo.b.nim202410101060;

public class Celcius {
    double suhu;
    public Celcius (double suhu) {
        this.suhu = suhu;
    }
    void toFahrenheit(){ System.out.println ("Celcius ke Fahrenheit adalah " + ((suhu * 9/5) + 32)); }
    void toKelvin(){ System.out.println ("Celcius ke Kelvin adalah " + (suhu + 273)); }
    void toReamur(){ System.out.println ("Celcius ke Reamur adalah " + (suhu * 4/5) + "\n") ; }
}
