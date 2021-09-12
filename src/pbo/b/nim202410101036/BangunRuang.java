package pbo.b.nim202410101036;

public class BangunRuang {
    public int panjang, lebar, tinggi, luas_permukaan, volume;

    public void luasPermukaan(){
        luas_permukaan = 2*((panjang*lebar) + (panjang*tinggi) + (lebar*tinggi));
        System.out.println("Luas Permukaan Balok (cm2) : " + luas_permukaan);
    }

    public void Volume(){
        volume = panjang*lebar*tinggi;
        System.out.println("Volume Balok         (cm3) : " + volume);
    }
}
