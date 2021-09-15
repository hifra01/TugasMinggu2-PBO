package pbo.b.nim202410101123;

public class Celcius {
    //Atribut / Property
    double suhu;

    //Method
    double toFahreinheit(){
        return (suhu*9/5) + 32;
    }

    double toKelvin(){
        return suhu + 273.15;
    }

    double toReamur(){
        return suhu * 4/5;
    }

    //Constructor
    Celcius(double suhu){
        this.suhu = suhu;
    }
}

