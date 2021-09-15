package pbo.b.nim202410101009;


// class celcius
class Celcius {
    Float suhu;


    // constructor
    Celcius (Float suhu) {
        this.suhu = suhu;
    }


    // method
    void toFahrenheit() {
        System.out.println("Konversi suhu dari Celcius ke Fahrenheit adalah " + ((1.8F * suhu) + 32) + " F");
    }
    void toKelvin() {

        System.out.println("Konversi suhu dari Celcius ke Kelvin adalah " + (suhu + 273) + " K");
    }
    void toReamur() {

        System.out.println("Konversi suhu dari Celcius ke Reamur adalah " + (0.8F * suhu) + " R");
    }
}