package pbo.b.nim202410101099;

class bangunRuang{
    double sisi;

    public void setSisi(double parasisi){
        sisi = parasisi;
    }

    public double luasPermukaan(){return 6*sisi*sisi;}
    public double volume(){return sisi*sisi*sisi;}
}