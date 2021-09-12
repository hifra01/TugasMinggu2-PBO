package pbo.b.nim202410101078;

public class celcius {
    double suhuCelcius;

    public celcius(double suhuCelcius){
        this.suhuCelcius = suhuCelcius;
    }

    double toFahreinhet(){
        return ((suhuCelcius*9/5)+32);
    }

    double toKelvin(){
        return (suhuCelcius+273);
    }

    double toReamur(){
        return (suhuCelcius*4/5);
    }
}
