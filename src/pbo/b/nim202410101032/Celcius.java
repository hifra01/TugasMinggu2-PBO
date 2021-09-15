package pbo.b.nim202410101032;

class Celcius {
    int derajatCel;
    public Celcius(int derajatCel){
        this.derajatCel = derajatCel;
    }
    int outFarenhait(){
        return (derajatCel * 9/5) + 32;
    }
    double outKelvin(){
        return derajatCel + 273.15;
    }
    double outReamur(){
        return derajatCel * 4/5;
    }
}

class mainCel{
    public static void main(String[]args){
        Celcius celciusdegree = new Celcius(100);
        System.out.print("- Konversi Celcius -");
        System.out.print("\nCelcius to Farenhait: "+celciusdegree.outFarenhait()+" F");
        System.out.print("\nCelcius to Kelvin: "+celciusdegree.outKelvin()+" K");
        System.out.print("\nCelcius to Reamur: "+celciusdegree.outReamur()+" R");
    }
}