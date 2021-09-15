package pbo.b.nim202410101136;

public class BangunRuang {
    double tinggi;
    double jari;

    public void setTinggi(double newtinggi){
        tinggi = newtinggi;
    }
    public void setJari(double newjari){
        jari = newjari;
    }
    double volumeTabung(){
        return (jari * jari * tinggi * 3.14);
    }
    double luasPermukaanTabung(){
        return (2 * 3.14 * jari * jari) + (2 * 3.14 * jari * tinggi);
    }
    double luasSelimutTabung(){
        return (2 * 3.14 * jari * tinggi);
    }
    public String toString(){
        return "Luas selimut tabung adalah " + luasSelimutTabung() + "\n" +"Luas permukaan tabung adalah " + luasPermukaanTabung() + "\n" + "serta volume tabung adalah " + volumeTabung();
    }
}