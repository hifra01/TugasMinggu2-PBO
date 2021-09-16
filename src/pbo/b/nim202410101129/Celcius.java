package pbo.b.nim202410101129;

public class Celcius {
   public double suhu;
   public Celcius(double suhu){
       this.suhu = suhu ;
    }

    public double toFahrenheit() {
        return suhu * (9.0 / 5) + 32;
    }

    public double toKelvin() {
        return suhu + 273.15;
    }

    public double toReamur() {
        return suhu * (4.0 / 5);
    }
}
