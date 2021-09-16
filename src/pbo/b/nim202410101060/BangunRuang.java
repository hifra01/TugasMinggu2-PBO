package pbo.b.nim202410101060;

public class BangunRuang {
    int sisi;
    public BangunRuang (int sisi) {
        this.sisi = sisi;
    }
    void luasPermukaan() { System.out.println ("Luas permukaannya " + (6 * sisi * sisi)); }
    void volume() { System.out.println ("Volumenya " + (sisi * sisi * sisi)); }
}
