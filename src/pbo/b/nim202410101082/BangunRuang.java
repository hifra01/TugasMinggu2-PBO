package pbo.b.nim202410101082;

public class BangunRuang {
    double jarijari;


    public BangunRuang(double jarijaribola){
        this.jarijari = jarijaribola;
    }
    public double VolumeBangun(){
        return (4.0 / 3.0) * Math.PI * jarijari * jarijari * jarijari;
    }
    public double LuasPermukaan(){
        return 4 * Math.PI * jarijari * jarijari;
    }
}
