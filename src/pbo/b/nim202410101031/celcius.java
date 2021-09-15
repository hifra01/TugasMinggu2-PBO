package pbo.b.nim202410101031;

public class celcius {
    double suhu;

    public celcius (double celcius){
        suhu = celcius;
    }

    void toFahrenheit(){
        System.out.println(suhu * 9/5 + 32 + " °F");
    }

    void toKelvin(){
        System.out.println(suhu + 273 + " K");
    }

    void toReamur(){
        System.out.println(suhu * 9/5 + " °R");
    }
}
