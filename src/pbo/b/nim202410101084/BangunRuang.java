package pbo.b.nim202410101084;

public class BangunRuang {
    int panjang, lebar, tinggi;

    BangunRuang(int panjang, int lebar, int tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    void volume() {
        int volume = panjang*lebar*tinggi;
        System.out.println(">> Volume balok adalah " + volume + " cm kubik");
    }
}