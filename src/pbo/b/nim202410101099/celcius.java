package pbo.b.nim202410101099;

class celcius{
    double suhu;

    public void setCelcius(double paracelcius){
        suhu = paracelcius;
    }

    public double toFahrenheit(){return ((double) suhu*1.8)+32;}
    public double toKelvin(){return ((double) suhu*0.8);}
    public double toReamur(){return (suhu+273.15);}
}