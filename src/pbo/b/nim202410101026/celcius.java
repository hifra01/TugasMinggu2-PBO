package pbo.b.nim202410101026;

public class celcius {
    double suhu;

    celcius(double suhu) {

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