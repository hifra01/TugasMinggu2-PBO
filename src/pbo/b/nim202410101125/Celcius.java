package pbo.b.nim202410101125;

public class Celcius {
    float suhu, fahrenheit, kelvin, reamur;

    public Celcius(float newSuhu){
        suhu = newSuhu;
    }
    public void toFahrenheit(){
        fahrenheit = 1.8f * suhu + 32;
        System.out.println("Konversi suhu dari Celcius ke Fahrenheit = "+fahrenheit);
    }
    public void toKelvin(){
        kelvin = suhu + 273;
        System.out.println("Konversi suhu dari Celcius ke Kelvin = "+kelvin);
    }
    public void toReamur(){
        reamur = 0.8f * suhu;
        System.out.println("Konversi suhu dari Celcius ke Reamur = "+reamur);
    }
}
