package pbo.b.nim202410101082;

public class Celcius {
    int suhu;

    public Celcius(int temperatur){
        suhu = temperatur;
    }

    public int suhuFahrenheit(){
        return ((suhu * 9) / 5) + 32;
    }
    public int suhuKelvin(){
        return (suhu + 273);
    }
    public int suhuReamur(){
        return (suhu * 4) / 5;
    }
}
