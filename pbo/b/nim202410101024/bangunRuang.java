package pbo.b.nim202410101024;

public class bangunRuang {
    double rujiRuji;
    double Tinggi;

    public void setrujiRuji(double newrujiRuji){
        rujiRuji = newrujiRuji;
    }
    public void setTinggi(double newTinggi){
        Tinggi = newTinggi;
    }

    double luaspermukaantabung(){
        return 2 * (3.14 * rujiRuji * rujiRuji) + (2 * 3.14 * rujiRuji * Tinggi);
    }
    double volumetabung(){
        return ((3.14 * rujiRuji * rujiRuji) * Tinggi);
    }
    @Override
    public String toString() {
        return "Luas Permukaan tabung yaitu" + " " + luaspermukaantabung() + "\n"+ "Volume tabung yaitu" + " " + volumetabung();
    }
}
