package pbo.b.nim202410101107;

public class CelciusFarenheit {

    double CelciusFarenheit;

    double toFarenheit;
    double toKelvin;
    double toReamur;

    public CelciusFarenheit(double Celcius) {
        this.CelciusFarenheit = Celcius;
    }
    double ToFarenheit(){
        return (CelciusFarenheit * (9/5)) + 32;
    }
    double ToKelvin(){
        return (CelciusFarenheit + 273.15);
    }
    double ToReamur(){
        return (CelciusFarenheit * (4/5));
    }
}

}
