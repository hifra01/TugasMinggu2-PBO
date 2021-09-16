package pbo.b.nim202410101004;

public class main {
    public static void main(String[] args) {

        System.out.println("====================================================\n ");
        Mahasiswa Perkenalanmhs = new Mahasiswa (" Naimatul Mutamimah ", " 202410101004 ", " Sistem Informasi ");
        Perkenalanmhs.Perkenalan();
        System.out.println(Perkenalanmhs.Perkenalan());

        System.out.println("====================================================\n ");
        
        Celcius Angka_ukur = new Celcius();
        Angka_ukur.setCelcius(45);
        System.out.println("Celcius ke Fahrenheit = " + Angka_ukur.toFahreinhet());
        System.out.println("Celcius ke Kelvin = " + Angka_ukur.toKelvin());
        System.out.println("Celcius ke Reamur = " + Angka_ukur.toReamur());

        System.out.println("====================================================\n ");

        BangunRuang bangunRuang1 = new BangunRuang();
        bangunRuang1.setJarijari(11);
        bangunRuang1.settinggi(10);

        System.out.println("Luas luas alas tabung yaitu " + bangunRuang1.luasalastabung ()+ " m2");
        System.out.println("keliling tabung yaitu " + bangunRuang1.kelilingdindingtabung () + " m2");
        System.out.println("Luas dindng tabung yaitu " + bangunRuang1.luasdindingtabung()+ " m2");
        System.out.println("Volume dari tabung yaitu " + bangunRuang1.volumetabung () + " m3");
        System.out.println("====================================================\n ");
}
}

