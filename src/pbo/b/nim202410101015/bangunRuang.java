package pbo.b.nim202410101015;

public class bangunRuang {
    float jari2, tinggi;

    public bangunRuang(float jari2, float tinggi){
        this.jari2 = jari2;
        this.tinggi = tinggi;
    }

    void setLuaspermukaan(){
        double luasPermukaan = 2 * 3.14 * jari2 * (jari2 * tinggi);
        System.out.println("\n" + luasPermukaan);
    }

    void setVolumetabung(){
        double volume = 3.14 * jari2 * jari2 * tinggi;
        System.out.println(volume);
    }
}
