package pbo.b.nim202410101051;

public class Celcius {
    double suhu;

    Celcius(double suhu) {
        this.suhu = suhu;
    }

    void toFarenheit(){
        double F = (suhu * 9/5) + 32;
        System.out.printf("%nCelcius to Farenheit = %.2f F%n", F);
    }

    void toKelfin(){
        double K = suhu +  273.15;
        System.out.printf("Celcius ke Kelfin = %.2f K%n", K);
    }

    void toReamur(){
        double R = 4.0/5 * suhu;
        System.out.printf("Celcius ke Reamur = %.2f R%n", R);
    }
}
