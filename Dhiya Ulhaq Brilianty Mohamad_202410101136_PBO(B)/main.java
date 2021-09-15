package pbo.b.nim202410101136;

public class main {
    public static void main(String[] args) {
        Mahasiswa kenalan =  new Mahasiswa("Dhiya Ulhaq Brilianty Mohamad", "202410101136", "Sistem Informasi");
        kenalan.Mahasiswa();
        System.out.println("===============================================================================================");

        Celcius ukur = new Celcius(150);
        ukur.Celcius();
        System.out.println("===============================================================================================");

        BangunRuang tabung = new BangunRuang();
        tabung.setJari(10);
        tabung.setTinggi(20);
        System.out.println(tabung.toString());
    }
}