public class celcius {
    double suhu;

    celcius(double suhu){
        this.suhu = suhu;
    }

    void toFahrenheit(){
        System.out.println(suhu + " derajat celcius ke Fahrenheit = " + suhu * 1.8 + 32 + " derajat");
    }
    void toKelvin(){
        System.out.println(suhu + " derajat celcius ke Kelvin = " + suhu + 273.15 + " derajat");
    }
    void toReamur(){
        System.out.println(suhu + " derajat celcius ke Reamur = " + suhu * 0.8 + " derajat");
    }
}
