package pbo.b.nim202410101030;

import java.util.Scanner;

public class Celcius {

//    property dan vatiabel
    Double Suhu;


//    Constructor
    public Celcius(Double Suhu){
        this.Suhu = Suhu;
    }

//    Method

    Double ToFahrenheit() {
        System.out.println("==========================");
        System.out.println("Mengkonversi ke Fahrenheit");
        System.out.println(Suhu+ "°C = "+ ((Suhu * 9/5) + 32)+"°F");
        return Suhu;
    }

    Double ToKelvin() {
        System.out.println("==========================");
        System.out.println("Mengkonversi ke Kelvin");
        System.out.println(Suhu+ "°C = "+ (Suhu+= 273.15)+ "K");
        return Suhu;
    }

    Double ToReamur(){
        System.out.println("==========================");
        System.out.println("Mengkonversi ke Reamur");
        System.out.println(Suhu+ "°C = "+ (Suhu*4/5)+ "°R");
        return Suhu;
    }




}
