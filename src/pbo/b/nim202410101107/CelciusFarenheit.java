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

class mainCelcius{
    public static void main(String[]args){
        CelciusFarenheit Celcius1 = new CelciusFarenheit(78);

        System.out.println("Derajat Farenheit adalah : " + Celcius1.ToFarenheit() +" F");
        System.out.println("Derajat Kelvin adalah : " + Celcius1.ToKelvin() +" K");
        System.out.println("Derajat Reamur adalah : " + Celcius1.ToReamur() + "R");

    }
}
