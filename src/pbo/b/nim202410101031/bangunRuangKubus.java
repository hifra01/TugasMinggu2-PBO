package pbo.b.nim202410101031;

public class bangunRuangKubus {
    float s;

    public bangunRuangKubus(float s){
        this.s = s;
    }

    void luasPermukaan(){
        System.out.println(s * s + " cm^2");
    }

    void Volume(){
        System.out.println(s * s * s + " cm^3");
    }
    
}
