package pbo.b.nim202410101036;

public class BangunRuang {
    int panjang, lebar, tinggi;

    int luasPermukaan(){
        return 2*((panjang*lebar) + (panjang*tinggi) + (lebar*tinggi));
    }

    int Volume(){
        return panjang*lebar*tinggi;
    }
}
