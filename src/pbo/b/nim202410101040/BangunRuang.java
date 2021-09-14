package pbo.b.nim202410101040;
import java.lang.Math;
public class BangunRuang {
    
    Double jarijari, tinggi;

    Double luasPermukaan() {
        return 2 * Math.PI * jarijari * (jarijari + tinggi);
    }
    Double volume() {
        return Math.PI * Math.pow(jarijari, 2) * tinggi;
    }
}