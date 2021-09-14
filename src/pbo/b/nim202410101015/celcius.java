package pbo.b.nim202410101015;

public class celcius {
    float suhu;

    public celcius(float suhu){
        this.suhu = suhu;
    }

    void toFahrenheit(){
        double F = (suhu * 9/5) + 35;
        System.out.println("\n\n" + F);
    }

    void toKelvin(){
        double K = suhu + 273.15;
        System.out.println(K);
    }
    
    void toReamur(){
        double R = suhu * 4/5;
        System.out.println(R);
    }
}