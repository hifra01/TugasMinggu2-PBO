package pbo.b.nim202410101136;

public class Celcius {
    double SuhuCelcius;
    public Celcius(double SuhuCelcius) {
        this.SuhuCelcius = SuhuCelcius;
    }
    double toFahreinhet() {
        return ((SuhuCelcius*9/5)+32);
    }
    double toKelvin() {
        return (SuhuCelcius + 273);
    }
    double toReamur() {
        return (SuhuCelcius*4/5);
    }
    public void Celcius(){
        System.out.println("Nilai konversi suhu dari celcius adalah " + "\n" + toFahreinhet() + " Fahrenheit" + "\n" + toKelvin() + " Kelvin" + "\n" + toReamur() + " Reamur");
    }
}

