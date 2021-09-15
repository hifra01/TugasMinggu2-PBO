package pbo.b.nim202410101118;

public class Celcius {
    double suhu;

    public Celcius (double c){
        suhu = c;
    }

    void toFahrenheit(){
        System.out.println(9/5 * suhu + 32 + " °F");
    }

    void toKelvin(){
        System.out.println(273 + suhu + " K");
    }

    void toReamur(){
        System.out.println(9/5 * suhu + " °R");
    }
}