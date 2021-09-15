package pbo.b.nim202410101109;

public class Celcius {
    double SuhuCelcius;
    double Farenheit;
    double Reamur;
    double Kelvin;

    public Celcius (double SuhuAwal)
    {
        this.SuhuCelcius = SuhuAwal;
        this.Farenheit = hitungFarenheit();
        this.Reamur = hitungReamur();
        this.Kelvin = hitungKelvin();
    }

    double hitungFarenheit(){
        //°F = °C × 1,8 + 32
        return (SuhuCelcius*1.8+32);
    }
    double hitungReamur(){
        //°Ré = °C × 0,8
        return (SuhuCelcius*0.8);
    }
    double hitungKelvin(){
        //K = °C + 273,15
        return (SuhuCelcius+273.15);
    }
}