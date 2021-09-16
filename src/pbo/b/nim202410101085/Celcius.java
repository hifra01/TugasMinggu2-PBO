package pbo.b.nim202410101085;

public class Celcius{
    int Suhu;

    public void setSuhu(int suhuCelcius){Suhu = suhuCelcius;}

    int toFahrenheit(){
        return (((Suhu * 9) / 5) + 32 );
    }

    int toReamur(){
        return (( Suhu * 4 ) / 5 );
    }

    int toKelvin(){
        return ( Suhu + 273 );
    }

    public String gabung1(){
        return  "Celcius ke Farenheit yaitu " + toFahrenheit() + " F, Celcius ke Reamur yaitu " + toReamur() + " R, Celcius ke Kelvin yaitu " + toKelvin() + " K.";
    }

}