package pbo.b.nim202410101002;

public class bangunRuang {
    int panjang;
    int lebar;
    int tinggi;

    public bangunRuang(int panjang, int lebar, int tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    public int LuasBalok() {
        return 2 * ((panjang*lebar) + (panjang*tinggi) + (lebar*tinggi));
    }

    public int volumeBalok() {
        return panjang*lebar*tinggi;
    }
}
