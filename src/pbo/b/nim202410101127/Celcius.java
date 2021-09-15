package pbo.b.nim202410101127;

public class Celcius {
    double suhu;
    double toFahrentheit;
    double toKelvin;
    double toReamur;

    public Celcius(){

        this.suhu = suhu;
    }

    double getSuhu(){

        return suhu;
    }

    void setSuhu(){
        this.suhu = suhu;
    }
    double toFarentheit(){
        return (1.8 * suhu) + 32;
    }
    double toKelvin(){

        return suhu + 273;
    }
    double toReamur(){
        return 0.8 * suhu;
    }
}
