package pbo.b.nim202410101130;

public class Main {

    public static void main(String[] args) {
        //Mahasiswa
        Mahasiswa aku = new Mahasiswa("Pramudya Widi Pradipta", "202410101130", "Sistem Informasi");
        System.out.println(aku);
        //Suhu
        Celcius suhu = new Celcius(100);
        System.out.println("\nFahrenheit : " + suhu.getFahrenheit() );
        System.out.println("Reamur : " + suhu.getReamur() );
        System.out.println("Kelvin : " + suhu.getKelvin() );
        //Bangun Ruang
        BangunRuang kerucut = new BangunRuang(5, 12);
        System.out.println("\nLuas bangun kerucut adalah : " + kerucut.getLuasBangun() + " cm persegi");
        System.out.println("Volume bangun kerucut adalah : " + kerucut.getVolumeBangun() + " cm kibik");

    }
}