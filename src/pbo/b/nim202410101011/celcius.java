package pbo.b.nim202410101011;

public class celcius {
    //property
    double suhu;
    //construktor
    public celcius(double suhu){
        this.suhu=suhu;
    }

    //method
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
