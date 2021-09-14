package pbo.b.nim202410101024;

import java.sql.SQLOutput;

public class main {
    public static void main(String[] args) {
        System.out.println("");
        mahasiswa Mhs =  new mahasiswa("Rindi Ayuningtiyas", "202410101024", "Sistem Informasi");
        Mhs.mahasiswa();
        System.out.println("===============================================================================================");

        System.out.println(" ");
        Celcius celcius = new Celcius();
        celcius.setTemp((100));
        System.out.println(celcius.tostring());

        System.out.println("===============================================================================================");
        System.out.println(" ");
        bangunRuang bgnruang =  new bangunRuang();
        bgnruang.setrujiRuji(2);
        bgnruang.setTinggi(1);
        System.out.println(bgnruang.toString());

    }
}
