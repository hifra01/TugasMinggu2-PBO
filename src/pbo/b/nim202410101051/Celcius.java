package pbo.b.nim202410101051;

public class Celcius {
    double suhu;

    Celcius(double suhu) {

        this.suhu = suhu;
    }

    double toFarenheit(){
        return (suhu * 9/5) + 32;
    }

    double toKelfin(){
        return suhu +  273.15;
    }

    double toReamur(){
        return 4.0/5 * suhu;
    }
}
