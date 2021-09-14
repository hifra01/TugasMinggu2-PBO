package pbo.b.nim202410101080;

import java.util.Scanner;

public class Celcius {
    private double celcius;
    Celcius(double celcius){this.celcius=celcius;}
    double toFarenheit(){
        return (celcius*(9/5F))+32;
    }
    double toKelvin(){
        return celcius +  273.15;
    }
    double toReamur(){
        return celcius*4/5;
    }
    public static void main(String[] args) {



    }


}


