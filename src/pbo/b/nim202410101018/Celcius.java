package pbo.b.nim202410101018;

public class Celcius {
    double celcius;
    public double toFahreinheit (double c) {
        celcius = (c *9/5) + 32 ;
        return celcius;
    }
    public double toKelvin (double c) {
        celcius = c + 273.15;
        return celcius;
    }
    public double toReamur (double c) {
        celcius = (c * 4/5);
        return celcius;
    }
}
