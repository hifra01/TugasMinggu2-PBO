package pbo.b.nim202410101095;

public class bangunRuang {
    
    double sisi;

    public bangunRuang(double sisi){
        this.sisi = sisi;
    }

    void LuasPermukaan(){
        System.out.println("========CLASS BANGUN RUANG KUBUS========");
        System.out.println(sisi*sisi+" cm persegi");
    }

    void Volume(){
        System.out.println(sisi*sisi*sisi+" cm kubik");
    }
}
