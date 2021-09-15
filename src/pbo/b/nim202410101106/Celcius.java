package pbo.b.nim202410101106;

class Celcius {
    int Suhu;
    public Celcius(int suhu) {this.Suhu = suhu;}

    int outputToFahrenheit() {return (Suhu * 9 / 5) + 32;}
    double outputToKelvin() {return Suhu + 273.15;}
    double outputToReamur() {return Suhu * 4 / 5;}
}

class maincelcius{
    public static void main(String[]args){
        Celcius Suhu1 = new Celcius(36);

        System.out.println("---------------------");
        System.out.println("PROGRAM KONVERSI SUHU");
        System.out.println("---------------------");
        System.out.println("Suhu: "+Suhu1.Suhu+" C");
        System.out.println("Celcius to Farenheit : "+Suhu1.outputToFahrenheit()+" F");
        System.out.println("Celcius to Kelvin : "+Suhu1.outputToKelvin()+" K");
        System.out.println("Celcius to Reamur : "+Suhu1.outputToReamur()+" R");
    }
}