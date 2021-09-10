package pbo.b.nim202410101130;

public class Celcius {
    double suhu;

    public Celcius(double newsuhu) {
        suhu = newsuhu;
    }
    public double getFahrenheit(){
        return suhu * 1.8 + 32;
    }
    public double getReamur(){
        return suhu * 0.8;
    }
    public double getKelvin(){
        return suhu + 273.15;
    }
}
