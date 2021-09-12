package pbo.b.nim202410101012;

public class celcius {
    double suhu;

    public celcius(double suhu){
        this.suhu = suhu;
    }
    double toFahrenheit(){
        return ((suhu*9/5)+32);
    }
    double toKelvin(){
        return ((suhu+273));
    }
    double toReamur(){
        return (suhu*4/5);
    }
}
