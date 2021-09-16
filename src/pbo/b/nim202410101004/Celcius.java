package pbo.b.nim202410101004;

public class Celcius {

    // Atribute
    double Suhu;

    // constructor
    public void setCelcius(double SuhuCelcius) {
        Suhu=SuhuCelcius;
    }
    
    // method
    double toReamur() {
        return (Suhu*4/5);
    }

    double toFahreinhet() {
        return ((Suhu*9/5)+32);
    }

    double toKelvin() {
        return (Suhu+273);

    }
   
    
}