package pbo.b.nim202410101009;

// class balok
class Balok{
    int panjang, lebar, tinggi;


    // constructor
    public Balok (int panjang, int lebar, int tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }


    // method
    void luas() {
        System.out.println("Luas permukaan balok adalah " + ((2 * panjang * lebar) + (2 * panjang * tinggi) +
                (2 * lebar * tinggi)) + " cm persegi");
    }
    void volume() {

        System.out.println("Volume balok adalah " + (panjang * lebar * tinggi) + " cm kubik");
    }
}